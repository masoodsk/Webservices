package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addingusers {

	WebDriver driver;

	public Addingusers(WebDriver driver) {

		driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),' Add User')]")
	WebElement addinguser;
	@FindBy(xpath = "/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")
	WebElement FirstName;
	@FindBy(xpath = "/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")
	WebElement LastName;
	@FindBy(xpath = "//form/table/tbody/tr[3]/td[2]/input")
	WebElement username;
	@FindBy(xpath = "//form/table/tbody/tr[4]/td[2]/input")
	WebElement password;
	@FindBy(xpath = "/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]")
	List<WebElement> lists;

	public void clickon_addinguser() {
		addinguser.click();
	}

	public void enterfirstname(String fname) {

		FirstName.sendKeys(fname);
	}

	public void entersecondname(String sname) {

		LastName.sendKeys(sname);
	}

	public void enterusername(String uname) {

		username.sendKeys(uname);
	}

	public void enterpassword(String pass) {

		password.sendKeys(pass);
	}

	public void selectcustomer(String userselection) {
		
		for (int i = 0; i < lists.size(); i++) {
			String sValue = lists.get(i).getText();

			// Select the checkbox if its value is the same that you want.
			if (sValue.equalsIgnoreCase(userselection)) {

				lists.get(i).click();

				// This statement will get you out of the for loop.
				break;
			}

		}
	}

}
