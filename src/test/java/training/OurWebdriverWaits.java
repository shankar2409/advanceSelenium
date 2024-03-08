package training;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OurWebdriverWaits {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//selenium3
		/**
		 * for selenium 3 
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		 */		
		//selenium4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void ExplicitWait(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement id = driver.findElement(By.id("sha"));
		wait.until(ExpectedConditions.elementToBeClickable(id));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sha")));
	}
	public static void fluentWait(WebDriver driver) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(By.className("uyrie")));
		wait.ignoring(NoSuchElementException.class);
	}
	public static void CustomWait(WebDriver driver) throws InterruptedException {
		int count=0;
		WebElement element = driver.findElement(By.id("sdh"));
		while(count<10) {
			try {
				element.click();
			} catch (Exception e) {
				Thread.sleep(1000);
				count++;
			}
		}
	}

}
