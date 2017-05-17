package utility;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {

	Properties prop = null;
	InputStream inputStream = null;
	public ConfigProperties() {
		try {
			inputStream = new FileInputStream("gui_automation.properties");
		prop = new Properties();
			prop.load(inputStream);
			System.out.println("Reading config file.....");

		} catch (IOException e) {
			System.out.println("Ërror in reading config file");
			e.printStackTrace();
		}

	}

	public String getBrowser() {
		return prop.getProperty("browser");
	}

	public String getBaseUrl() {
		return prop.getProperty("url");
	}

	public String getUserName() {
		return prop.getProperty("userName");
	}
	public String getWrongUserName() {
		return prop.getProperty("wuserName");
	}


	public String getPassword() {
		return prop.getProperty("password");
	}
	public String getWrongPassword() {
		return prop.getProperty("wpassword");
	}

	public long getWaitTime() {
	return Long.valueOf(prop.getProperty("waitTime"));
		
	}

	public String getOperatingSystem() {
		return prop.getProperty("operatingSystem");

	}

}
