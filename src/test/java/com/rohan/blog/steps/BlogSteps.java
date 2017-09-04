package com.rohan.blog.steps;


import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * http://blog.czeczotka.com/2014/07/22/cucumber-jvm-with-maven-in-minutes/
 */
public class BlogSteps {

    public static final String BLOG_URL = "http://altenit-ubuntu01.cloudapp.net:8088/blog";
    public WebDriver driver;


    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Given("^I am a blog visitor$")
    public void i_am_a_blog_visitor() throws Throwable {
        // No context needed
    }

    @When("^I open the blog$")
    public void i_open_the_blog() throws Throwable {
        // Start Browser and call the URL
        driver.get(BLOG_URL);
    }

    @Then("^I see the latest blog posts$")
    public void i_see_the_latest_blog_posts() throws Throwable {
        List<WebElement> rows = driver.findElements(By.cssSelector(".ui-datagrid-column1"));
        Assert.assertNotEquals("Check that there are blog post rows", rows.size(), 0);
    }


    @Given("^I am a blog editor$")
    public void i_am_a_blog_editor() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I log into the blog using a username and password$")
    public void i_log_into_the_blog_using_a_username_and_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be logged and see additional functionality only visible to editors$")
    public void i_should_be_logged_and_see_additional_functionality_only_visible_to_editors() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I log into the blog$")
    public void i_log_into_the_blog() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^there are existing blog posts$")
    public void there_are_existing_blog_posts() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be able to Edit the blog content$")
    public void i_should_be_able_to_Edit_the_blog_content() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I log in to the blog$")
    public void i_log_in_to_the_blog() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be able to Create a new post$")
    public void i_should_be_able_to_Create_a_new_post() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be able to Delete a new post$")
    public void i_should_be_able_to_Delete_a_new_post() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



    @After
    public void tearDown() {
        driver.quit();
    }

}
