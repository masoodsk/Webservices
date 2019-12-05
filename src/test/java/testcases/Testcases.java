package testcases;

import org.testng.annotations.Test;

import pageobjects.Addingusers;
import pageobjects.Baseclass;
import utilities.Randomgenerate;

public class Testcases extends Baseclass {

	
	@Test
	public void Tc_Adduser() throws InterruptedException {
		
		Addingusers objaddinguser=new Addingusers(driver);
		objaddinguser.clickon_addinguser();
		Thread.sleep(2000);
		
		String firstname=Randomgenerate.randomAlphaNumeric();
		String secondname=Randomgenerate.randomAlphaNumeric();
		//String uname=Randomgenerate.randomAlphaNumeric();
		objaddinguser.enterfirstname(firstname);
		objaddinguser.entersecondname(secondname);
		objaddinguser.enterusername(firstname+secondname);
		objaddinguser.enterpassword(firstname);
		String selctionuser="Company AAA";
		objaddinguser.selectcustomer(selctionuser);
	}
	
}
