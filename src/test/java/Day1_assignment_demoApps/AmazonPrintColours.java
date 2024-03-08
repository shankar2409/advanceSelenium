package Day1_assignment_demoApps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonPrintColours {
	@Test(groups="smoke")
	public void name() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-text")).click();
//		driver.findElement(By.xpath("//span[.='Apple iPhone 15 Pro (512 GB) - White Titanium']")).click();
//		List<WebElement> ele = driver.findElements(By.cssSelector("[class*=\"a-section s-color-swatch-outer-circle s-color-swatch-pa\"]"));
		for (String str : driver.getWindowHandles()) {
			driver.switchTo().window(str);
		}
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='variation_color_name']/descendant::img"));
//		List<WebElement> ele = driver.findElements(By.xpath("//span[.='Apple iPhone 15 Plus (256 GB) - Blue']/ancestor::div[@class='puisg-col-inner']/descendant::a[@role='button']"));
		for (WebElement str : ele) {
			System.out.println(str.getAttribute("aria-label"));
		}
		System.out.println("smoke");
	}
	// div[@id='variation_color_name']/descendant::img
}
