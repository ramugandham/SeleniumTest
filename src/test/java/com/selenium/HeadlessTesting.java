package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadlessTesting {
	public static void main(String[] args) {
		/*
		 * ChromeOptions options=new ChromeOptions(); options.addArguments
		 * ("--headless=new"); // setting for headless mode of execution WebDriver
		 * driver=new ChromeDriver(options); driver.get("https://demo.opencart.com/");
		 * String act_title=driver.getTitle(); System.out.println(act_title);
		 */
		//accepts ssl certificates
		/*
		 * ChromeOptions options1=new ChromeOptions();
		 * options1.setAcceptInsecureCerts(true) ; WebDriver driver1=new
		 * ChromeDriver(options1); driver1.get("https://expired.badssl.com/"); String
		 * act_title1=driver1.getTitle(); System.out.println(act_title1);
		 */
		
		//run incognitmode

		 ChromeOptions options=new ChromeOptions(); 
		 options.addArguments("--incognito");
		 WebDriver driver=new ChromeDriver(options); 
		 driver.get("https://demo.opencart.com/");
		 String act_title=driver.getTitle(); 
		 System.out.println(act_title);
		 //enble extensions at runtime
	}
}
