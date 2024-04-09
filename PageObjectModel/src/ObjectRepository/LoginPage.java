package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By username=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By pass=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By loginBtn= By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By forgotLink=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void EnterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void EnterPassword(String password)
	{
		driver.findElement(pass).sendKeys(password);
	}
	
	public void ClickLoginBtn()
	{
		driver.findElement(loginBtn).click();
	}
	
	public void LoginToApp(String u,String p)
	{
		driver.findElement(username).sendKeys(u);	
		driver.findElement(pass).sendKeys(p);
		driver.findElement(loginBtn).click();
		
	}
	
	

}
