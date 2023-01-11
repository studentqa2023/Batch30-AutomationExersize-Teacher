package com.stepdef;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pagefactory.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExerciseStepDef {
	
	WebDriver driver;
	MasterPageFactory mpf;
	
	@Given("Open the browser")
	public void open_the_browser() {
	   
	   WebDriverManager.chromedriver().setup();
	   
	   driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	}

	@Given("Pass the URL")
	public void pass_the_url() {
	   
	    driver.navigate().to("https://www.automationexercise.com/");
	}

	@When("Click on Login1")
	public void click_on_login1() {
	   
	    mpf = new MasterPageFactory(driver);
	    
	    mpf.getLoginbtn1().click();
	}

	@When("Enter the username")
	public void enter_the_username() {
	   
	    mpf.getEmail1().sendKeys("rezwanislam857@gmail.com");
	}

	@When("Enter the password")
	public void enter_the_password() {
	   
	    mpf.getPassword().sendKeys("Boston#2023");
	}

	@When("Click on Login2")
	public void click_on_login2() {
	   
	    mpf.getLoginbtn2().click();
	}

	@Then("Validate login is successful")
	public void validate_login_is_successful() {
	   
	    if(mpf.getLogoutbtn().isDisplayed()) {
	    	Assert.assertTrue(mpf.getLogoutbtn().isDisplayed(), "Login pass.");
	    	System.out.println("Login Successful!");
	    } else {
	    	Assert.assertTrue(mpf.getLogoutbtn().isDisplayed(), "Login fail.");
	    	System.out.println("Login Failed!");
	    }
	}
	
	@When("Click on Logout")
	public void click_on_logout() {
	    
	    mpf.getLogoutbtn().click();
	}

	@Then("Validate logout successfully")
	public void validate_logout_successfully() {
	    
	    if(mpf.getLoginbtn2().isDisplayed()) {
	    	Assert.assertTrue(mpf.getLoginbtn2().isDisplayed(), "Logout pass");
	    	System.out.println("Logout successful!");
	    } else {
	    	Assert.assertTrue(mpf.getLoginbtn2().isDisplayed(), "Logout fail");
	    	System.out.println("Logout failed!");
	    }
	}
	
	@Given("Pass the URL {string}")
	public void pass_the_url(String URL) {
	    
	    driver.navigate().to(URL);
	}

	@When("Enter the username {string}")
	public void enter_the_username(String username) {
	    
		mpf.getEmail1().sendKeys(username);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
	    
		 mpf.getPassword().sendKeys(password);
	}
	
}
