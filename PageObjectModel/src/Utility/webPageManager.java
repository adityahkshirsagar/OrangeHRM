package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webPageManager {
	
	public WebDriver LaunchURL()
	{

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		options.setBinary("C:\\Users\\Aditya\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}


}
