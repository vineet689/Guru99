package utility;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

	public class CommonDriver {

		public static WebDriver driver = null;

		@BeforeClass
		public void setUp() throws Exception {

			ConfigProperties config = new ConfigProperties();

			if (config.getBrowser().equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (config.getBrowser().equalsIgnoreCase("chrome")) {

				if (config.getOperatingSystem().equalsIgnoreCase("windows")) {
					System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				} else if (config.getOperatingSystem().equalsIgnoreCase("mac")) {
					System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				}
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-popup-blocking");
				driver = new ChromeDriver();
			} else if (config.getBrowser().equalsIgnoreCase("internetExplorer")) {
				driver = new InternetExplorerDriver();

			} else {
				System.out.println(config.getBrowser());
			}

			driver.get(config.getBaseUrl());
			driver.manage().timeouts().implicitlyWait(config.getWaitTime(), TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

		@AfterClass
		public void tearDown() {
			driver.close();
			driver.quit();
		}

	}
