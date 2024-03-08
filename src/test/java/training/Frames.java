package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		nestedWithMultipleFrame(driver);
	}

	public static void frame(WebDriver driver) {
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		WebElement address = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(address);
		driver.findElement(By.id("username")).sendKeys("shankar");
	}

	public static void nestedFrame(WebDriver driver) {
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		WebElement address = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(address);
//		WebElement address1 = driver.findElement(By.tagName("iframe"));
//		driver.switchTo().frame(address1);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("shankar");
	}

	public static void multipleFrame(WebDriver driver) {
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement address = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(address);
		driver.findElement(By.id("email")).sendKeys("shankar@123");
		driver.switchTo().defaultContent();
		WebElement address1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(address1);
		driver.findElement(By.id("username")).sendKeys("shankar");

	}

	public static void nestedWithMultipleFrame(WebDriver driver) {
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		driver.findElement(By.cssSelector("[class='w-full h-96']"));
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("shankar");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys("shank");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys("shank");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.id("submitButton")).click();
		driver.switchTo().defaultContent();
	}
	
}
