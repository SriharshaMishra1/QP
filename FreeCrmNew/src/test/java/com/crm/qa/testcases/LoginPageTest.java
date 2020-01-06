package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initializatin();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title=loginpage.validateLoginTitle();
		Assert.assertEquals(title, "vtiger CRM 5 - Commercial Open Source CRM");
		System.out.println("Title validation successful");
	}
	
	@Test(priority=2)
	public void crmLogoVerify()
	{
		boolean flag=loginpage.crmImageValidation();
		Assert.assertTrue(flag);
		System.out.println("Image validation successful");
	}
	@Test(priority=3)
	public void loginTest() throws Throwable
	{
 homepage=loginpage.login(prop.getProperty("username"),
		 prop.getProperty("password"));
         System.out.println("===login to App===");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("===Logout===");
		driver.close();
		
	}
	
}
