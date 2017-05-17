package appModules;




import org.openqa.selenium.By;
import org.testng.Reporter;
import objectRepositry.LoginPage;
import utility.CommonDriver;
import utility.ConfigProperties;


//This is called Modularization, when we club series of actions in to one Module
//For Modular Driven Framework, please see

public class LoginActions extends CommonDriver {
	 static final ConfigProperties config = new ConfigProperties();
	 

	 public static void OpenLoginPage() throws Throwable{
		 LoginPage.link_Account().click();
		 LoginPage.link_Login().click();
	 }
	public static  void verifyWrongLogin() throws Throwable{
		LoginPage.txt_username().clear();
		LoginPage.txt_username().sendKeys(config.getWrongUserName());
		LoginPage.txt_password().clear();
		LoginPage.txt_password().sendKeys(config.getWrongPassword());
		LoginPage.button_login().click();
		if(driver.findElement(By.cssSelector("p.welcome-msg")).isDisplayed()){
			Reporter.log("Loggedin successfully!! ");  
		}
		else{
			Reporter.log("Unable to Loggedin !! ");  
		}
		//driver.close();
	}
		public static void verifyCorrectLogin() throws Throwable{
		LoginPage.txt_username().clear();
		LoginPage.txt_username().sendKeys(config.getUserName());
		LoginPage.txt_password().clear();
		LoginPage.txt_password().sendKeys(config.getPassword());
		LoginPage.button_login().click();
	
		if(driver.findElement(By.cssSelector("p.welcome-msg")).isDisplayed()){
			Reporter.log("Loggedin successfully!! ");  
		}
		else{
			Reporter.log("Unable to Loggedin !! ");  
		}
//	driver.close();
	}

	

}
