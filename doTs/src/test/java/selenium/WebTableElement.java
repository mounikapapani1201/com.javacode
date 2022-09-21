package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTableElement extends BaseTest {

	@Test
	public void Webelement1() {
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> country = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		for (WebElement c : country)
			System.out.println(c.getText());

	}

	@Test
	public void WebElement2() {
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement r : row)
			System.out.println(r.getText());
	}

}
