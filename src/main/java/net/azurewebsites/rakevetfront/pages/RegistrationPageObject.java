package net.azurewebsites.rakevetfront.pages;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class RegistrationPageObject extends BasePageObject {
public String pageUrl = "https://rakevet-front.azurewebsites.net/register";
	public RegistrationPageObject(WebDriver driver, Logger log) {
		super(driver , log);
	}
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
}
