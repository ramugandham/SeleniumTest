package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	
	//selecting future date
	static void selectFutureDate (WebDriver driver,  String year, String month, String date) {
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // ad
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actual
																												// adte
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// Next
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click();// previous
		}

		// select the date
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {

				break;
			}
			dt.click();
		}
	}
	//selecting past date
		static void selectPastDate (WebDriver driver,  String year, String month, String date) {
			while (true) {
				String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // ad
				String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actual
																													// adte
				if (currentMonth.equals(month) && currentYear.equals(year)) {
					break;
				}

				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// previous
			}

			// select the date
			List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

			for (WebElement dt : allDates) {
				if (dt.getText().equals(date)) {

					break;
				}
				dt.click();
			}
		}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		// switch to frame
		driver.switchTo().frame(0);
		// Method1 using sendkeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); //

		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // 
		String year = "2023";
		String month = "May";
		String date = "10";
		//selectFutureDate(driver, year, month, date);
		selectPastDate(driver, year, month, date);
	}
}
