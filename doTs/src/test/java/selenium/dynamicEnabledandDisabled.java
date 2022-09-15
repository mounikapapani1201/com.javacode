package selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dynamicEnabledandDisabled extends BaseTest{
	
	@Test 
	public void dycontrols() throws InterruptedException {
		  driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		Boolean enablebutton =  driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).isEnabled();
		  if(enablebutton=true) {
			  System.out.println("button is enabled");
		  }
		  
		  else{
			  System.out.println("button is disabled");
		  }
}
}
