package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	
	WebDriver driver;
	By ApplyLeave=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[4]/button/svg");
	By LeaveTypeDropdown=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div");
	By UserRolDrpDown=By.id("systemUser_userType");
	By EmpName=By.id("systemUser_employeeName_empName");
	By UserName=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By Status=By.id("systemUser_status");
	By Password=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By CnfPass=By.id("systemUser_confirmPassword");
	By SaveBtn=By.id("btnSave");
	By SerchUserName=By.id("searchSystemUser_userName");
	By SerchBtn=By.id("searchBtn");
	
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//This constructor is crested becsuse we have to maintain same driver instance across all pages.
	
	public void ClickOnApplyLeave() throws InterruptedException
	{
		driver.findElement(ApplyLeave).click();
		
	}
	
	public void FillLeaveForm()
	{
		driver.findElement(LeaveTypeDropdown).click();
		
		
	}

}
