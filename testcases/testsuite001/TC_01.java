package testsuite001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomepageObject;
import pageObject.LoginPageObject;

public class TC_01 {

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		homepage = new HomepageObject(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void Login_01_Login() {
		homepage.openURL();
		loginPage = homepage.openLoginPage();

	}

	@AfterClass
	public void afterClass() {
//		driver.quit();
	}

	WebDriver driver;
	HomepageObject homepage;
	LoginPageObject loginPage;

}