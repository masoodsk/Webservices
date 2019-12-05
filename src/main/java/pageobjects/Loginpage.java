package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver = driver;
		PageFactory.initElements(driver, this);
			
		
	}
	
	
	@FindBy(id="txtUsername")
	public WebElement txtusername;
	
	@FindBy(id="txtPassword")
	public WebElement txtpassword;
	
	@FindBy(id="btnLogin")
	public WebElement btnlogin;
	

	@FindBy(id="welcome")
	public WebElement verifyusername;
	
	public void setUserName(String uname) {
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String pass) {
		
		txtpassword.sendKeys(pass);
	}
	
	public void clickonsign() {
		btnlogin.click();
	}
	
	
	public String verifyusernames() {
		
		return verifyusername.getText();
		
		
		
		
	}
}
