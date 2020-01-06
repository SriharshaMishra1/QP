package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.Testutil;

public class LoginPage extends TestBase{
	Testutil testutil;
	
	@FindBy(name="user_name")
	WebElement username;
	@CacheLookup
	
	@FindBy(name="user_password")
	WebElement password;
	@CacheLookup
	
	@FindBy(xpath="//input[@id='submitButton']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@src='include/images//OutlookPlugin.png']")
	WebElement crmImage;
	@FindBy(xpath="//img[@src='test/logo/vtiger-crm-logo.gif']")
	WebElement crmLogo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginTitle()
	{
	String title=driver.getTitle();
	return title;
	}
	
	
	public  boolean crmImageValidation()
	{
		return crmImage.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) throws Throwable
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		testutil.THREAD(5000);
		loginBtn.click();
		return new HomePage();
	}
	
}
