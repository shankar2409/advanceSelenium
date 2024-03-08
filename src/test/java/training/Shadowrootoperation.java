package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowrootoperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
//		sr1(driver);
//		driver.navigate().refresh();
		sr2(driver);

	}

	public static void sr1(WebDriver driver) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//div[@id='userName']"));
		SearchContext sc = ele.getShadowRoot();
		WebElement ele1 = sc.findElement(By.cssSelector("#kils"));
		ele1.sendKeys("shankar");
		ele1.clear();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\").value=\"shankar\";");
		WebElement webele = (WebElement) js
				.executeScript("document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")");
		webele.sendKeys("shaksd");
	}

	public static void sr2(WebDriver driver) {
		WebElement ele = driver.findElement(By.cssSelector("#userName")).getShadowRoot()
				.findElement(By.cssSelector("#app2")).getShadowRoot().findElement(By.cssSelector("#pizza"));
		ele.sendKeys("pizzaOrdered");
		ele.clear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele1 = (WebElement) js.executeScript(
				"document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		ele1.sendKeys("pizza");
	}

	public static void sr3(WebDriver driver) {
		
	}
}
