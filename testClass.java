package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.UIMap;

public class testClass {
	private WebDriver driver;
	private static String username = "";
    private static String password = "";
    private static String url = "";
   // private static String PROPERTIES_PATH ="data.property"; 

	
	@BeforeClass
    public void ReadProperty() {
    	FileInputStream fis;
		try {
			fis = new FileInputStream("data.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Cant't read config.properties file!");
			return;
		}
		
		Properties p = new Properties();
		try {
			p.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Cant't read config.properties file!");
			return;
		}
		
		url = p.getProperty("baseURL");
		password = p.getProperty("Password");
		username = p.getProperty("UserName");
		//password = p.getProperty("PASSWORD");
		//browser = p.getProperty("BROWSER");
		//firefoxPath = p.getProperty("FIREFOX_PATH");
	}

	@BeforeTest
	public void getBrowser(){
		System.setProperty("webdriver.chrome.driver", "F://Data//ChromeDriver//chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://live.guru99.com/index.php");
		
		

	}
	
	@Test(priority =0)
	public void getLoginPage(){
		driver.findElement(By.xpath("//header[@id='header']/div/div[2]/div/a/span")).click();
		driver.findElement(By.linkText("Log In")).click();
		WebElement loginObject= driver.findElement(By.id(""));
		System.out.println(loginObject+ "We found So Login page opened successfully");
		
	}
	
	@Test(priority=1)
	public void LoginApp(){
		driver.findElement(By.id("email")).sendKeys("vineet689@gmail.com");
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.id(""));
		String Usermsg= driver.findElement(By.cssSelector("p.welcome-msg")).getText(); 
		if(Usermsg.contains("vineet sharma!")){
			System.out.println("Loggedin Successfully!!");
		}
		else{
			System.out.println("Unable to login, please check");
		}
		
	}
}
