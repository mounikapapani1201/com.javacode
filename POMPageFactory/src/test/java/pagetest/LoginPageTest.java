package pagetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.ReportUtils;
import pageclasses.loginPage;


public class LoginPageTest extends BaseTest {
	loginPage lp;
	
	@Test
	public void loginWithCorrectCredentials(){

		lp =new loginPage(driver);
		lp.enterUserName("mounikapapani1201@gmail.com");
		lp.enterPassword("mouni@123");	
		lp.clickSubmit();
		Assert.assertEquals(lp.getloginPageTitle(), "My account - My Store");
		ReportUtils.log.pass("the page title is validated successfully");
		
	}
@Test

public void loginWithIncorrectCredentials() {
	 lp =new loginPage(driver);
	lp.enterUserName("mounikapapani12@gmail.com");
	lp.enterPassword("mouni@123");	
	lp.clickSubmit();
	Assert.assertEquals(lp.getAlertMessage(), "There is 1 error");
	ReportUtils.log.pass("the alert message is validated");
	
	
}
}
