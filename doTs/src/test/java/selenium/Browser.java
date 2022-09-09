package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	WebDriver driver;
	@Test
	public void googlesearch() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		searchbox.sendKeys("Google Text");
		searchbox.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the current urls is:" + currentUrl);
		System.out.println("the title is:" + driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

	
	@AfterTest
	
	public void teardown() {
		
		driver.close();
		driver.quit();
	}
	
}
