package advsele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMytripFlipghtBooking {
	WebDriver driver;

	@Test(groups="smoke")
	public void accessApp() throws AWTException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("[class='headerIcons makeFlex hrtlCenter column active']")).click();
		driver.findElement(By.cssSelector("[data-cy='oneWayTrip']")).click();
		WebElement fromcity = driver.findElement(By.id("fromCity"));
		fromcity.click();
//		fromcity.clear();
		fromcity.sendKeys("coimbatore");
		List<WebElement> fromcitysug = driver.findElements(By.cssSelector("[class='react-autosuggest__suggestions-list']"));
		for (WebElement webElement : fromcitysug) {
		if (webElement.getText().equalsIgnoreCase("coimbatore")) {
			webElement.click();
		}
	}
}
			
		
//		fromcity.click();
//		WebElement toCity=driver.findElement(By.id("toCity"));
//		toCity.clear();
//		toCity.sendKeys("new Delhi");
//		toCity.click();
	}
