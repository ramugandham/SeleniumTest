package com.selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium. TakesScreenshot; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureScreenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts ().implicitlyWait(Duration. ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/"); 
		driver.manage().window().maximize();
		//1) full page screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourcefile=ts.getScreenshotAs (OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png"); 
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		//2. specific section of page and ele to take screenshot
		WebElement specificele = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		File sourcefile1=specificele.getScreenshotAs(OutputType.FILE);
		  File targetfile1=new File(System.getProperty("user.dir")+"\\screenshots\\specificele.png"); 
			sourcefile1.renameTo(targetfile1);
	}

}
