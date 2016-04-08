package com.rohan.blog;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.rohan.blog.blog.dataaccess.BlogModelDao;
import com.rohan.blog.entity.Blog;
import com.rohan.blog.utils.GenerateUUID;

@ContextConfiguration("file:src/test/resources/applicationContextTest.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class BlogTest {

	@Autowired
	BlogModelDao blogModelDao;

	@Test
	public void createBlogPostWithUUIDAsTitleAndCheckIfExistsInDatabase() {

		String myUU = new GenerateUUID().ToString();
		
		Blog blog = new Blog();
		blog.setBlogContent(myUU);
		blog.setBlogContentLable("Eric de Graaf has placed content. for post " + 
				myUU + " as the UUID. ");

		blog.setCreatedDate(new Date());
		blogModelDao.save(blog);

		System.out.println("Freshly created blog entry with blog id " + blog.getBlogId());
		
		assertEquals(blog.getBlogContent(),myUU);
		
	}
}
