package org.ust.Lanch1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insert2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Selenium1\\Drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com");
		WebElement txtUser = drive.findElement(By.id("email"));
		txtUser.sendKeys("Sathish");
		WebElement txtPass = drive.findElement(By.id("pass"));
		txtPass.sendKeys("8465");
		}
}
