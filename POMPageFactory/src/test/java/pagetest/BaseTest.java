package pagetest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import Utils.BaseUtils;
import Utils.ReportUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;

	@BeforeSuite
	public void intialize() {
		ReportUtils.initReport();
	}

	@BeforeMethod
	public void setup(Method method) throws IOException {
		ReportUtils.createTest(method.getName());

		String browser = BaseUtils.getConfigValue("browser");

		switch (browser) {
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			ReportUtils.log.info("chrome browser launched");
			break;

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			ReportUtils.log.info("firefox browser launched");
			break;

		case "edgedriver":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			ReportUtils.log.info("edge browser launched");
			break;
		default:
			System.out.println("please check the browser");
		}

			driver.manage().timeouts()
					.implicitlyWait(Duration.ofSeconds(Integer.parseInt(BaseUtils.getConfigValue("implicitWait"))));
			driver.manage().window().maximize();
			String url = BaseUtils.getConfigValue("url");
			driver.get(url);
			ReportUtils.log.info("url is launched" + url);

		}

	

	@AfterMethod
	public void end() {

		driver.close();
		driver.quit();
		ReportUtils.log.info("browser is closed");
	}
	
	@AfterSuite
	public void tearDown() {
		ReportUtils.generateReports();
		
	}
}
