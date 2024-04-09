package TestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import Utility.webPageManager;

public class TestAdminPage extends webPageManager {
	
	WebDriver driver;
	
	@Test (priority=0)
	public void Login() throws InterruptedException
	{
		WebDriver driver=LaunchURL();
		
		LoginPage l=new LoginPage(driver);
		l.LoginToApp("Admin","admin123");
		
		driver.close();
	}
}
