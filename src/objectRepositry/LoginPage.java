package objectRepositry;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import utility.CommonDriver;



public class LoginPage extends CommonDriver{
	private static WebElement element = null;
    
    public LoginPage(WebDriver driver){
        	
        	
    }   
	
	
	public static WebElement link_Account() throws Exception{
          try{ 
        	   	 element = driver.findElement(By.xpath("//header[@id='header']/div/div[2]/div/a/span"));
	        	// System.out.println("Login Element: "  +driver.findElement(By.xpath("//header[@id='header']/div/div[2]/div/a/span")).isDisplayed());
	             System.out.println("My Account link is found on the Home Page");
	                     
	             }catch (Exception e){
        	  System.out.println("My Acocunt link is not found on the Home Page");
         	//	System.out.println("Elemet not found");
         	//	System.out.println("Login Element: "  +driver.findElement(By.xpath("//header[@id='header']/div/div[2]/div/a/span")).isDisplayed());
         		}
         	return element;
      }
	
	public static WebElement link_Login() throws Exception{
		try{
		element = driver.findElement(By.linkText("Log In"));
		}catch(Exception e){
			throw(e);
		}
		return element;
	}
	
	
	public static WebElement txt_username() throws Exception{
		try{
		element =driver.findElement(By.id("email"));
		}catch(Exception e){
			throw(e);
		}
		return element;
	}  
	
	
	public static WebElement txt_password() throws Exception{
		try{
		element =driver.findElement(By.id("pass"));
		}catch(Exception e){
			throw(e);
		}
		return element;
		
	}
	
	public static WebElement button_login() throws Exception{
		try{
		element =driver.findElement(By.id("send2"));
		}catch(Exception e){
			throw(e);
		}
		return element;
		
	}


}
