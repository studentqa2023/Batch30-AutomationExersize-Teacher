package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(), 'Login')]")
	private WebElement loginbtn1;
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement email1;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="(//*[contains(text(), 'Login')])[4]")
	private WebElement loginbtn2;
	
	@FindBy(xpath="//*[contains(text(), 'Logout')]")
	private WebElement logoutbtn;

	public WebElement getLoginbtn1() {
		return loginbtn1;
	}

	public WebElement getEmail1() {
		return email1;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn2() {
		return loginbtn2;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	

}
