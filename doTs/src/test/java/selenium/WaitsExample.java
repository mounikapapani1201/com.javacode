package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsExample extends BaseTest {

	// using Thread.sleep

	/*
	 * @Test public void dycontrols() throws InterruptedException {
	 * driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	 * driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
	 * Thread.sleep(3000);
	 * driver.findElement(By.xpath("//button[contains(text(),'Add')]")); boolean e =
	 * driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
	 * System.out.println("its gone is displayed" +e); Assert.assertTrue(true);
	 * 
	 * }
	 * 
	 * 
	 */
	// using implicitwaits

	/*
	 * @Test public void dycontrols() {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	 * driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
	 * WebElement Addbutton =
	 * driver.findElement(By.xpath("//button[contains(text(),'Add')]")); boolean e =
	 * Addbutton.isDisplayed(); Assert.assertTrue(true);
	 * 
	 * }
	 */

	// using ExplicitWaits
	/*
	 * @Test public void dycontrols() { WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(15));
	 * driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	 * driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
	 * 
	 * WebElement Addbutton =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//button[contains(text(),'Add')]"))); boolean e = Addbutton.isDisplayed();
	 * Assert.assertTrue(true);
	 */
	/* } */

	// using FluentWaits

	@Test public void dycontrols() { WebDriverWait wait = (WebDriverWait) new
	  FluentWait<WebDriver>(driver) .withTimeout(Duration.ofSeconds(15))
	  .pollingEvery(Duration.ofSeconds(3)) .ignoring(NoSuchElementException.class);
	  
	  driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	  WebElement removebutton = driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
	  removebutton.click();
	  WebElement Addbutton = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		         return driver.findElement(By.xpath(
	  "//button[contains(text(),'Add')]"));
		     }
	  }
	}

	Addbutton.isDisplayed();Assert.assertTrue(true);

}
