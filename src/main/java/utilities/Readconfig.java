package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {

	Properties prop;

	public Readconfig()  {

		File src = new File("./configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

		}

	}

	public String getUrl() {

		String baseurl = prop.getProperty("baseurl");
		return baseurl;
	}

/*	public String getUserName() {
		String username = prop.getProperty("username");
		return username;
	}

	public String getPassword() {
		String pass = prop.getProperty("pass");
		return pass;
	}
*/
	public String getchromepath() {

		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}

	public String getfirefoxpath() {

		String firefoxpath = prop.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getinternetexplorerpath() {

		String internetexplorer = prop.getProperty("internetexplorer");
		return internetexplorer;
	}

}
