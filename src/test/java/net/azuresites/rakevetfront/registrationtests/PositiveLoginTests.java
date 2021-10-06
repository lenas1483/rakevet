package net.azuresites.rakevetfront.registrationtests;

import org.testng.annotations.Test;

import net.azurewebsites.rakevetfront.base.TestUtilites;
import net.azurewebsites.rakevetfront.pages.BasePageObject;
import net.azurewebsites.rakevetfront.pages.HomePage;
import net.azurewebsites.rakevetfront.pages.LoginPageObject;
import net.azurewebsites.rakevetfront.pages.RegistrationPageObject;

import org.testng.Assert;

@Test
public class PositiveLoginTests extends TestUtilites {
	
	public void logInTest() {
		log.info("Starting log in test");
		

		// open main page
		LoginPageObject loginPageObject = new LoginPageObject(driver,log);
		HomePage homePage = new HomePage(driver,log);
		loginPageObject.openPage();
		
		 // loginPageObject.logIn("lena@moonsite.co.il", "Moonsite78");
		  
		  log.info("Main page is opened."); 
		  BasePageObject basePageObject = new BasePageObject(driver,log);
		 // basePageObject.waitForVisibilityOf(homePage.logOutButton);
		 
		basePageObject.waitForVisibilityOf(loginPageObject.registrationLink);
		//Assert.assertTrue(homePage.isLogOutButtonVisible(), "LogOut Button is not visible.");
		loginPageObject.regPage();
		RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver,log);
		log.info(registrationPageObject.getPageUrl());
	}

}
