package pagetest;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.HomePage;

import pageclasses.loginPage;

public class HomePageTest extends BaseTest{
	loginPage lp;
	HomePage hp;
	@Test
	public void verifyAccountOptionsTest() {
		lp = new loginPage(driver);
		lp.login("mounikapapani1201@gmail.com", "mouni@123");
		
		hp = new HomePage(driver);
		ArrayList<String> myOptions = hp.getMyAcoountOptions();
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Order history and details".toUpperCase());
		alist.add("My credit slips".toUpperCase());
		alist.add("My addresses".toUpperCase());
		alist.add("My personal information".toUpperCase());
		alist.add("My wishlists".toUpperCase());
		 
		Assert.assertEquals(myOptions,  alist);
		
		
		
		
	}

}
