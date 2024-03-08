package advsele;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extendedreport {
	@Test
	public void report() {
		
		
		WebDriver  driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		String screenshot=ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter er=new ExtentSparkReporter("extendedReports\\takeScr.html");
		ExtentReports ew=new ExtentReports();
		ew.attachReporter(er);
		 ExtentTest test = ew.createTest("uyytftuyyu");
		test.log(Status.INFO, "succesfully added");
		test.addScreenCaptureFromBase64String(screenshot);
		ew.flush();
	}
}
