package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDownExample2 extends BaseTest {

	@Test
	public void dropDownTest() {
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByIndex(1);
		country.selectByVisibleText("BANGLADESH");
		country.selectByValue("BARBADOS");

	}

	@Test
	public void multipledropDownTest() throws InterruptedException {
		driver.get("https://output.jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByIndex(0);
		Thread.sleep(3000);
		fruits.selectByValue("apple");
		Thread.sleep(3000);
		fruits.selectByVisibleText("Orange");

		fruits.deselectAll();

	}

	@Test
	public void DropDowntest2() throws InterruptedException {
		driver.get("https://output.jsbin.com/osebed/2");

		Select selectfruit = new Select(driver.findElement(By.id("fruits")));
		List<WebElement> list = selectfruit.getOptions();
		for (WebElement e : list) {
			System.out.println("all the fruits:" + e.getText());
		}
	}

}
