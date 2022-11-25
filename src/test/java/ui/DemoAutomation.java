package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

public class DemoAutomation {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\katerina.angjelkoska\\browserdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\katerina.angjelkoska\\browserdrivers\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\katerina.angjelkoska\\browserdrivers\\msedgedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://time.mk");
		driver.quit();
		

	}

}
