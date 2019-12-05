package testcases;

import org.testng.annotations.Test;

import pageobjects.AddingEssforEmployee;
import pageobjects.Baseclass;

public class addingEssEmployeedetails extends Baseclass{
	
	
	@Test(priority = 2)
	public void AddingEssdetails() {
		
		
		AddingEssforEmployee addingess=new AddingEssforEmployee(driver);
		addingess.fn_clickonadmin();
		addingess.fn_clickaddEmployeeess();
	}

}
