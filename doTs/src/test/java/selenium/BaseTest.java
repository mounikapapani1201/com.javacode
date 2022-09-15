package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	

	@BeforeTest
	public void setup() {
		
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void teardown() {

		driver.close();
		driver.quit();
	}
}
