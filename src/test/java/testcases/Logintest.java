package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AddingEssforEmployee;
import pageobjects.Baseclass;
import pageobjects.Loginpage;

public class Logintest extends Baseclass {
	String titleofpage = "OrangeHRM";
	String username = "Admin";

	@Test(priority = 1)

	public void Loginfunction() {

		logger.info("Browser is opened");
		Loginpage objloginpage = new Loginpage(driver);

		//objloginpage.setUserName(username);
	//	objloginpage.setPassword(pass);
		objloginpage.clickonsign();

		logger.info("Title of the page is " + driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase(titleofpage)) {

			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		String getusername = objloginpage.verifyusernames();
		String[] user = getusername.split("\\s");

		if (username.equalsIgnoreCase(user[1])) {

			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	

	@Test(priority = 2)
	public void AddingEssdetails() {
		
		
		AddingEssforEmployee addingess=new AddingEssforEmployee(driver);
		addingess.fn_clickonadmin();
		addingess.fn_clickaddEmployeeess();
	}


}
