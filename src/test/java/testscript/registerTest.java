//package testscript;
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import generic.ReadExcel;
//import generic.UtilityMethods;
//import pomScript.BasePage;
//
//public class registerTest extends BasePage {
//	
//	@DataProvider(name="data")
//	public Object[][] data() throws Exception {
//		return ReadExcel.getMultipleData("sheet1");
//		
//	}
//	@Test(dataProvider = "data")
//	public void getdata(String fn,String ln,String email,String p,String cp) throws Throwable {
//		UtilityMethods um=new UtilityMethods();
////		um.getValueProperty("https://demowebshop.tricentis.com/");
////		um.URL="https://demowebshop.tricentis.com/";
////		registrationPage rp=new registrationPage(driver);
////		rp.getRegister().click();
////		rp.getFirstName().sendKeys(fn);
////		rp.getLastName().sendKeys(ln);
////		rp.getEmail().sendKeys(email);
////		rp.getPassowrd().sendKeys(p);
////		rp.getConfirmPassword().sendKeys(cp);
////		rp.getRegisterButton().click();
//	}
//}
