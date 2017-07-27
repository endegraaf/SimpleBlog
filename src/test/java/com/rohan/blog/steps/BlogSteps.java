package com.rohan.blog.steps;


import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * http://blog.czeczotka.com/2014/07/22/cucumber-jvm-with-maven-in-minutes/
 */
public class BlogSteps {

    public static final String BLOG_URL = "http://localhost:8088/blog";
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
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
