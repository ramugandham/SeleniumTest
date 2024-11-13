package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); //ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		
		  // passing the text into inputbox alternate of sendKeys() 
		JavascriptExecutor js=(JavascriptExecutor)driver; //JavascriptExecutor js=driver;
		  js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox); 
		  //clicking on element alternate of click() 
		  WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		  js.executeScript("arguments[0].click()", radiobtn); 
		  //scroll down page by pixel number 
		  js.executeScript("window.scrollBy (0,1500)", "");
		  System.out.println(js.executeScript("return window.pageYOffset;")); //1500
		  //2) scroll the page till element is visible 
		  WebElement ele=driver.findElement(By.
		  xpath("//a[normalize-space()='Hidden Elements & AJAX']"));
		  js.executeScript("arguments[0].scrollIntoView();", ele);
		  System.out.println(js.executeScript ("return window.pageYOffset;")); //??|
		  
		  //3) scroll page till end of the page.
		  js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		  System.out.println(js.executeScript("return window.pageYOffset;"));
		  //2103.428466796875 Thread.sleep(5000); //scrolling up to initial position
		  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); //setzoom level 50% 
		  js.executeAsyncScript("document.body.style.zoom='50%'");
		 
		//single file upload
		driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("‪C:\\Users\\User\\Desktop\\Screenshots\\2024\\Nov-24\\3.png");
		
		
	}

}
