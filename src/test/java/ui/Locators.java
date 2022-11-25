package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static String browser = "edge"; // External configuration - XLS, CSV (to be done)
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("https://www.saucedemo.com/");
		
		WebElement password = driver.findElement(By.id("password"));
		driver.findElement(with(By.tagName("input")).above(password)).sendKeys("Testing"); //Relative Locators
				
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//driver.quit();
		

	}

}
