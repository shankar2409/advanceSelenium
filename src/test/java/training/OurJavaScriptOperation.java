package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurJavaScriptOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://www.amazon.in/";
		/*
		 * driver.get(url);
		 * 
		 * Point loc = ele.getLocation(); int x=loc.getX(); int y=loc.getY();
		 * System.out.println(x+ " "+y);
		 * 
		 * js.executeScript("window.scrollBy("+x+","+y+")");
		 */

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", url);
		scrollpage5Times(driver, js);
	}

	public static void scrollOperation(WebDriver driver, JavascriptExecutor js) {
		// open browser

		WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
		// scroll till bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// scroll up top of the page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		// scroll into till element
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}

	public static void passTheValues(WebDriver driver, JavascriptExecutor js) {
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].value=arguments[1]", element, "highlander shoes");
//		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
//		js.executeScript("arguments[0].click()",searchbtn);
		js.executeScript("document.getElementById(\"nav-search-submit-button\").click()");
//		WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
		String text = (String) js.executeScript("return arguments[0].innerText", ele);
		System.out.println(text);
	}

	public static void scrollpage5Times(WebDriver driver, JavascriptExecutor js) throws InterruptedException {
		
		for (int i = 1; i <= 5; i++) {
			js.executeScript("window.scrollBy(0,900)");
			Thread.sleep(2000);
		}
		for(int i=1;i<=5;i++) {
			js.executeScript("window.scrollBy(0,-900)");
			Thread.sleep(2000);
		}
	}

}
