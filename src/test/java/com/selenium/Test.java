package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		
		//ChromeDriver driver =new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://tutorialsninja.com/demo");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Your Store")) {
			System.out.println("test pass");
			
		}else {
			System.out.println("test fail");
		}
		//driver.close();
		
	}

}
