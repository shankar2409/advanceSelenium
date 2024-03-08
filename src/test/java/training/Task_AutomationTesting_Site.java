package training;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_AutomationTesting_Site {
static	Set<String> allId; 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		windows(driver);
		frames(driver);
	}
	public static void windows(WebDriver driver) throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.partialLinkText("click")).click();
		allId = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		allId.remove(parentId);
		for (String str : allId) {
			driver.switchTo().window(str);
		}
		System.out.println(driver.findElement(By.cssSelector("[class='d-1 fw-bold']")).getText());
		Thread.sleep(3000);
		driver.switchTo().window(parentId);
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[.='click']")).click();
		allId=driver.getWindowHandles();
		allId.remove(parentId);
		for (String str : allId) {
			String url = driver.switchTo().window(str).getCurrentUrl();
			if (url.contains("https://www.selenium.dev/")) {
				break;
			}
		}
		System.out.println(driver.findElement(By.cssSelector("[class='d-1 fw-bold']")).getText()+"  new Window");
		driver.switchTo().window(parentId);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[id='Multiple'] [class='btn btn-info']")).click();
		allId=driver.getWindowHandles();
		allId.remove(parentId);
		for (String str : allId) {
			String url = driver.switchTo().window(str).getCurrentUrl();
			if (url.contains("https://demo.automationtesting.in/Index.html")) {
				break;
			}
		}
		driver.switchTo().window(parentId);
		
	}
	public static void frames(WebDriver driver) throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("[type='text']");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
		driver.switchTo().frame(0);
		WebElement address = driver.findElement(By.xpath("//h5/following-sibling::iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(address);
		List<WebElement> sd = driver.findElements(By.tagName("input"));
		for(int i=1;i<=sd.size();i++) {
			if (i==2) {
				sd.get(i).sendKeys("shanka");
				break;
			}
		}
		
	}
}
