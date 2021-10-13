package net.azurewebsites.rakevetfront.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePageObject {

	public LoginPageObject(WebDriver driver, Logger log) {

		super(driver, log);
	}

	private String pageUrl = "https://israrail-development-front.azurewebsites.net/";
	private By emailLocator = By.id("email");
	private By passwordLocator = By.id("password");
	public By registrationLink = By.className("Login_register__alreadyHaveUserName__AA3fv");
	// private by forgotPasswordLocator = By.;
	private By connectButton = By.className("MuiButton-label");
	// private By registerLink =
	// By.className("Login_register__alreadyHaveUserName__AA3fv");

	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened");
	}

	public HomePage logIn(String email, String password) {
		log.info("Executing LogIn with username [" + email + "] and password [" + password + "]");
		type(email, emailLocator);
		type(password, passwordLocator);
		// driver.findElement(connectButton).click();
		click(connectButton);
		return new HomePage(driver, log);
	}
	
	public RegistrationPageObject regPage() {
		click(registrationLink);
		return new RegistrationPageObject(driver, log);
	}

}
