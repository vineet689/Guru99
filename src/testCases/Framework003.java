package testCases;



import org.testng.annotations.Test;
import appModules.LoginActions;
import appModules.MobilePageAction;
import utility.CommonDriver;

public class Framework003 extends CommonDriver{

	
	@Test(priority =0)
	public void testLoginwithIncorrect() throws Throwable{
		LoginActions.OpenLoginPage();
		LoginActions.verifyWrongLogin();
	}
	
	@Test(priority = 1)
	public void testLoginwithcorrect() throws Throwable{
		LoginActions.OpenLoginPage();
		LoginActions.verifyCorrectLogin();
	}
	
	@Test(priority =2)
	public void testMobile() throws Throwable{
		
		MobilePageAction.ExecuteMobilePage();
		
	}
	
	@Test(priority =3)
	public void testCartAdding() throws Throwable{
		MobilePageAction.addItemIntoCart();
	}

}
