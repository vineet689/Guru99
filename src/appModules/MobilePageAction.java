package appModules;

import org.testng.Reporter;

import objectRepositry.MobilePage;
import utility.CommonDriver;

public class MobilePageAction extends CommonDriver {
	
	public static  void ExecuteMobilePage() throws Throwable{
		MobilePage.mobile_Link().click();
		boolean Mobile= MobilePage.root_Text().isDisplayed();
		if(Mobile==true){
			Reporter.log("Move into mobile page, No issue found");
		}
			else{
				Reporter.log("There is some issue");
			}
		}
	
	public static void addItemIntoCart() throws Throwable{
		MobilePage.selectProduct().click();
		MobilePage.selectQty().click();
		MobilePage.cartButton().click();
	}
	
	
	//	driver.close();
	}
	


