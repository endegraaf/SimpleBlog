package com.rohan.blog;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rohan.blog.blog.dataaccess.BlogModelDao;

public class BlogTest {

	@Before
	public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
	}

	@Autowired
	BlogModelDao blogModelDao;

	@Test
	public void myFirstTest() {

//		Blog blog = new Blog();
//		blog.setBlogContent("sfdsf");
//		blog.setBlogContentLable("Eric de Graaf");
//
//		blog.setCreatedDate(new Date());
//		blogModelDao.save(blog);

		assertTrue(true);
		
	}
}
