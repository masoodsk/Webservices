package pageobjects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.Readconfig;
//UFT Driver script
public class Baseclass {
	
	Readconfig readconfig = new Readconfig();
	public String baseurl = readconfig.getUrl();
//	public String username = readconfig.getUserName();
	//public String pass = readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		logger = logger.getLogger("Orange Hrm");
		PropertyConfigurator.configure("log.properties");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxpath());
			driver = new FirefoxDriver();
		} else if (br.equals("IE")) {
			System.setProperty("webdriver.ie.driver", readconfig.getinternetexplorerpath());
			driver = new InternetExplorerDriver();

		}
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	//@AfterClass
	public void closebr() {
		driver.close();
	}
}
