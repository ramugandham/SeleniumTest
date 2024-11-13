package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='country']"));
		Select sele1=new Select(ele);
		//sele1.selectByVisibleText("Australia");
		//sele1.selectByValue("brazil");
		//sele1.selectByIndex(2);
		List<WebElement> options = sele1.getOptions();
		System.out.println(options.size());
		for(WebElement list:options) {
			System.out.println(list.getText());
		}
		//driver.close();
		
	}
	
}
