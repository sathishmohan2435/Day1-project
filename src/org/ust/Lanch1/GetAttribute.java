package org.ust.Lanch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Selenium1\\Drivers\\chromedriver.exe");
	WebDriver drive = new ChromeDriver();
	drive.get("https://www.facebook.com");
	WebElement firstName = drive.findElement(By.name("firstname"));
	firstName.sendKeys("Sathish");
	String at = firstName.getAttribute("Value");
	System.out.println("First Name: "+ at);
	
	
}
}
