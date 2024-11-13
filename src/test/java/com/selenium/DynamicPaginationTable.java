package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		  // close window if it is available 
		if
		  (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		  { 
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
			}
		  driver.findElement(By.xpath("//a[@class='parent']")).click(); // customers main memu 
		  driver.findElement(By.
		  xpath("//ul[@id='collapse-5']//[contains(text(), 'Customers')]")).click(); //custo
		  
		  // Showing 1 to 10 of 19881 (1989 Pages) 
		  String text = driver.findElement(By.xpath("//div[contains(text(), 'Pages')]")).getText();
		  int total_pages = Integer.parseInt(text.substring(text.indexOf(" (") + 1,text.indexOf("Pages") - 1)); // repeating pages
		  for (int p = 1; p <=total_pages; p++) {
			  if (p > 1) {
				  WebElement active_page =driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + p +"]"));
          active_page.click(); 
         
			  
			  
			  
			  }
		  
		  }
		 

	}

}
