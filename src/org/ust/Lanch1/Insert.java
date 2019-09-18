package org.ust.Lanch1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insert {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver","C:\\Users\\Sathish\\Project Class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement openGoogle = driver.findElement(By.name("q"));
		openGoogle.sendKeys("amazon.in");
		}
}
