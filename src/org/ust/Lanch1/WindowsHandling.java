package org.ust.Lanch1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\Selenium1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		driver.manage().window().maximize();
		String oldWindow = driver.getWindowHandle();
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		Set<String> handles = driver.getWindowHandles();
		for(String newWindow: handles) {
			driver.switchTo().window(newWindow);
		}
		WebElement editBut =driver.findElement(By.xpath(("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img")));
		editBut.click();
		WebElement fill = driver.findElement(By.id("email"));
		fill.sendKeys("Sai is the Great");
	
		
	}

}
