package pageclasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	By options = By.xpath("//div[@class='row addresses-lists']//span");

	public ArrayList<String> getMyAcoountOptions() {

		List<WebElement> elements = driver.findElements(options);
		ArrayList<String> list = new ArrayList<String>();

		for (WebElement ele : elements) {
			list.add(ele.getText());

		}
		return list;
	}
}
