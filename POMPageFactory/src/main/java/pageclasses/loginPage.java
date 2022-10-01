package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.ReportUtils;

public class loginPage {

	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;

	}

	By usrname = By.id("email");
    By pswd = By.id("passwd");
	By submit = By.id("SubmitLogin");
	By alertMessage = By.xpath("//p[text()='There is 1 error']");
	
	

	public void enterUserName(String username) {
		driver.findElement(usrname).sendKeys(username);
		ReportUtils.log.info("Enter username :" +username);

	}

	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
		ReportUtils.log.info("Enter password :" +pass);
		
	}

	public void clickSubmit() {
		driver.findElement(submit).click();
		ReportUtils.log.info("clicked on submit button");
	}

	public String getloginPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getAlertMessage() {
		String alertmsg = driver.findElement(alertMessage).getText();
		return alertmsg;

	}

	public void login(String username, String pass) {
		enterUserName(username);
		enterPassword(pass);
		clickSubmit();

	}

}
