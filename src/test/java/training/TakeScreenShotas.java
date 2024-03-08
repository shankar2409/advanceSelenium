package training;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class TakeScreenShotas {
	 static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 LocalDateTime dateAndTime = LocalDateTime.now();
		 String requiredFormat = dateAndTime.toString().replaceAll(":", "-");
		/* 
		Date date = new Date();
		SimpleDateFormat sp = new SimpleDateFormat("yyyy-mm-dd");
		String requiredFormat = sp.format(date);
		*/
		 screenshotForWebPage(driver,requiredFormat);
		screenshotforElement(driver,requiredFormat);
		driver.quit();
		
	}
	public static void screenshotForWebPage(WebDriver driver,String requiredFormat) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File distination = new File("./screenshot/"+requiredFormat+".png");
		Files.copy(source, distination);
	}
	public static void screenshotforElement(WebDriver driver,String requiredFormat) throws IOException {
		WebElement element = driver.findElement(By.id("name"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File distination = new File("./screenshot/"+requiredFormat+".png");
		Files.copy(source, distination);
	}
	public static void screenshotInFireFox(WebDriver driver,String requiredFormat) throws IOException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File distiny=new File("./screenshot/"+requiredFormat+".png");
		Files.copy(source, distiny);
	}

}
