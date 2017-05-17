package objectRepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.CommonDriver;

public class MobilePage extends CommonDriver{
	private static WebElement element = null;
	
	
	public static WebElement mobile_Link() throws Exception{
		try{
			element = driver.findElement(By.linkText("MOBILE"));
			System.out.println("Mobile Link found");

		}catch (Exception e){
			System.out.println("Mobile Link not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement root_Text() throws Exception{
		try{
			element = driver.findElement(By.cssSelector("div.category-description.std"));
			System.out.println("Enetered into Mobile page");

		}catch (Exception e){
			System.out.println("Root element not found seems not move into mobile page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement selectProduct()throws Exception{
		try{
			element = driver.findElement(By.id("product-collection-image-1"));
			System.out.println("Product collection image Found");
		}catch (Exception e){
			System.out.println("Product collection image not Found");
			throw(e);
		}
		return element;
	}
	
	
	
	public static WebElement selectQty()throws Exception{
		try{
			element = driver.findElement(By.id("qty"));
			System.out.println("Quantity Found");
		}catch (Exception e){
			System.out.println("Quantity not Found");
			throw(e);
		}                  //driver.findElement(By.id("qty")).sendKeys("2");
		return element;
	}
	
	public static WebElement cartButton()throws Exception{
		try{
			element = driver.findElement(By.cssSelector("button.button.btn-cart"));
			System.out.println("Cart button found");
		}catch (Exception e){
			System.out.println("Cart button not found");
			throw(e);
		}                  //driver.findElement(By.id("qty")).sendKeys("2");
		return element;
	}
	
	
	//driver.findElement(By.id("product-collection-image-1")).click();
	
	
//	assertTrue(isElementPresent(By.cssSelector("div.category-description.std")));
	
	
	
}
