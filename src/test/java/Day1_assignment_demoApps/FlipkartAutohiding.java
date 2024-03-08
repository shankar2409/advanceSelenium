package Day1_assignment_demoApps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartAutohiding {
	@Test(groups = "smoke")
	public void main() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("puma shoes");
		List<WebElement> ele = driver.findElements(By.cssSelector("[class*='D0G']"));
		for (WebElement we : ele) {
			System.out.println(we.getText());
			if (we.getText().contains("sneakers")) {
				we.click();
				break;
			}
		}
		System.out.println("regression");
	}
}
