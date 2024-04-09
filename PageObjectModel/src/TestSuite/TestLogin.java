package TestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import Utility.webPageManager;
import Utility.Screenshot;

public class TestLogin extends webPageManager {
	
	@Test
	public void LoginTest()
	{
		WebDriver driver=LaunchURL();
		
		LoginPage l=new LoginPage(driver);
		l.EnterUsername("Admin");
		l.EnterPassword("admin123");
		l.ClickLoginBtn();
		
	//	l.LoginToApp("Admin", "admin123");
		
		Screenshot.getScreenshot(driver,"First_TestCase");
		
		driver.manage().deleteAllCookies();
		
		driver.close();
	}

}
