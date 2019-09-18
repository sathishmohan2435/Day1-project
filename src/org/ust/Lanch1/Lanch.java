package org.ust.Lanch1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Lanch {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\Selenium1\\Drivers\\chromedriver.exe");
	//System.setProperty("webdriver.ie.driver","C:\\Users\\Sathish\\Selenium1\\Drivers\\IEDriverServer.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sathish\\Selenium1\\Drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//String s=driver.getCurrentUrl();
		//String s1=driver.getTitle();
	}

}
