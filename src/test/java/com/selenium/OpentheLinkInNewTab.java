package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/"); 
		driver.manage().window().maximize();
		WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act=new Actions (driver);
		act.keyDown(Keys.CONTROL).click(reglink).keyUp (Keys. CONTROL).perform();
		//switching to registration page
		List<String> ids=new ArrayList<>(driver.getWindowHandles());
		//Registration
		driver.switchTo().window(ids.get(1)); // switch to registration page driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John KENEDY");
		//Home page
		driver.switchTo().window(ids.get(0)); // switch to home page
		///TAB to windows
		driver.get("https://demo.nopcommerce.com/"); 

		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://text-compare.com/"); 
	}

}
