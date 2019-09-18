package org.ust.Lanch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Nithish {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\Selenium1\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.name("q"));
	
	element.sendKeys("Wikipedia");
	WebElement search = driver.findElement(By.id("gsr"));
	search.click();
	WebElement element1 = driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[3]/center/input[1]"));
	element1.click();
	WebElement element2 = driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div/div[1]/a/h3/div"));
	element2.click();
	WebElement Search1 = driver.findElement(By.id("ooui-php-1"));
	Search1.click();
	WebElement dhandhi = driver.findElement(By.xpath("//*[@id=\'searchInput\']"));
	dhandhi.sendKeys("About ghandhi");
	WebElement search1 = driver.findElement(By.id("//*[@id=\'mw-search-top-table\']/div/div/div/span/span/button/span[2]"));
	search1.click();
	
	
	
    
	
}
}
