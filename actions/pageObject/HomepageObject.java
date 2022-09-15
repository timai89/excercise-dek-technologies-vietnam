package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.HomePageUI;

public class HomepageObject extends BasePage {
	WebDriver driver;

	public HomepageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void openURL() {
		openPageUrl(driver, GlobalConstants.PORTAL_PAGE_URL);
	}

	public LoginPageObject openLoginPage() {
		waitForElementVisible(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return LoginPageObject.getLoginPage(driver);
	}

}
