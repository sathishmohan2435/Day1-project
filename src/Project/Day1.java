package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\Selenium1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement openGoole = driver.findElement(By.name("q"));
		openGoole.sendKeys("amazon.in");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement amazonLinkEnter = driver.findElement(By.xpath("//h3[@class='sA5rQ']"));
		//r.keyPress(KeyEvent.VK_ENTER);
	//	r.keyRelease(KeyEvent.VK_ENTER);
		amazonLinkEnter.click();
		WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		amazonSearchBox.sendKeys("one pluses 7 pro mobile");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		List<WebElement> listOfOnePlus = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int s = listOfOnePlus.size();
		System.out.println(s);
		for (WebElement x : listOfOnePlus) {
			System.out.println(x.getText());
			
		}
			
		}
		
		
		}
	

