package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void getScreenshot(WebDriver driver,String PicName)
	{
		//convert driver object to TakeScreenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//call getScreenshotAs method to create file
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(file, new File("D:\\Automation and Testing\\Testing Files\\POM\\Screenshot"+PicName+".png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("File path genrated successfully");
		}
	}

}
