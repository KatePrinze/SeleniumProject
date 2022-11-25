package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethods {

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
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		driver.navigate().to("https://www.sugarcrm.com/uk/?utm_source=sugarcrm.com&utm_medium=referral");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		
		//driver.navigate().to("http://google.com");
		driver.quit();
		
		
		//WebElement password = driver.findElement(By.id("password"));
		//driver.findElement(with(By.tagName("input")).above(password)).sendKeys("Testing"); //Relative Locators		
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//driver.quit();
		

	}

}
