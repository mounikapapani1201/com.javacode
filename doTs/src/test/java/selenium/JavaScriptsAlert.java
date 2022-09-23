package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptsAlert extends BaseTest {

	/*
	 * @Test public void Alert1() throws InterruptedException {
	 * driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
	 * ; Thread.sleep(3000); Alert jsAlert = driver.switchTo().alert(); String
	 * AlertText = jsAlert.getText(); Thread.sleep(3000);
	 * Assert.assertEquals(AlertText, "I am a JS Alert"); jsAlert.accept(); String
	 * Result = driver.findElement(By.id("result")).getText();
	 * Assert.assertEquals(Result,"You successfully clicked an alert");
	 * 
	 * }
	 */

	/*
	 * @Test public void Alert2() throws InterruptedException {
	 * driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
	 * (); Thread.sleep(3000); Alert jsAlert = driver.switchTo().alert(); String
	 * AlertText = jsAlert.getText(); Thread.sleep(3000);
	 * Assert.assertEquals(AlertText, "I am a JS Confirm");
	 * 
	 * jsAlert.dismiss(); String Result =
	 * driver.findElement(By.id("result")).getText();
	 * Assert.assertEquals(Result,"You clicked: Cancel");
	 * 
	 * }
	 */
	@Test
	public void Alert3() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert jsAlert = driver.switchTo().alert();
		String AlertText = jsAlert.getText();
		Thread.sleep(3000);
		Assert.assertEquals(AlertText, "I am a JS prompt");
		jsAlert.sendKeys("mouni");

		jsAlert.accept();
		String Result = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(Result, "You entered: mouni");

	}

}
