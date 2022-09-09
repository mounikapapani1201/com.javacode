package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators1 {
// it helps to locate web elements on web page
	// 8 types
	// find elememnt() -returns one web element
	// find elements()-returns list of elements
	WebDriver driver;

	@Test
	public void googleSearch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);

		//WebElement submit = driver.findElement(By.className("fa fa-2x fa-sign-in"));
		WebElement submit = driver.findElement(By.className("radius"));
		submit.click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the current urls is:" + currentUrl);

	}

	@AfterTest
	public void teardown() {

		driver.close();
		driver.quit();
	}
}
