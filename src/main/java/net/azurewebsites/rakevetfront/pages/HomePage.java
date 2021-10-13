package net.azurewebsites.rakevetfront.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePageObject {

	public By logOutButton = By.className("header_profile__photo__3Zp1a");
	public By lessonsButton = By.className("MuiButton-label");



	public HomePage(WebDriver driver, Logger log) {
		// TODO Auto-generated constructor stub
		super(driver,log);
	}
	
	public boolean isLogOutButtonVisible() {
		return find(logOutButton).isDisplayed();
	}
	
	public boolean isLessonButtonVisibale() {
		return find(lessonsButton).isDisplayed();
	}
	public LessonsPageObject lessonspage() {
		click(lessonsButton);
		return new LessonsPageObject(driver, log);
	}
}
