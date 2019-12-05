package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddingEssforEmployee {

	public WebDriver driver;
	public AddingEssforEmployee(WebDriver driver) {
		
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement clickonadmin;
	
	
	@FindBy(id="btnAdd")
	public WebElement clickaddEmployeeess;
	
	
	@FindBy(id="systemUser_userType")
	public WebElement SelectuserType;
	
	
	@FindBy(id="systemUser_employeeName_empName")
	public WebElement employeename;
	
	
	@FindBy(id="systemUser_userName")
	public WebElement systemusername;
	
	
	@FindBy(xpath = "//*[@id=\"systemUser_password\"]")
	public WebElement systemUser_password;
	
	
	@FindBy(xpath = "//*[@id=\"systemUser_confirmPassword\"]")
	public WebElement systemUser_confirmPassword;
	
	
	@FindBy(id="btnSave")
	public WebElement btnSave; 
	
	
	
	
	
	public void fn_clickonadmin() {
		clickonadmin.click();
	//	Actions objaction=new Actions(driver);
//		objaction.moveToElement(clickonadmin).build().perform();
		
	//	WebDriverWait waiter=new WebDriverWait(driver, 5);
		//waiter.until(ExpectedConditions.elementToBeClickable(objaction.moveToElement(clickonadmin).build().perform()));
	}
	
	public void fn_clickaddEmployeeess() {
		clickaddEmployeeess.click();
	}
	
	public void fn_SelectuserType(String userType) {
		
		Select listempl=new Select(SelectuserType);
		listempl.selectByValue(userType);
		
	}
	
	public void fn_employeename(String employeenames) {
		employeename.sendKeys(employeenames);
	}
	
	
}
