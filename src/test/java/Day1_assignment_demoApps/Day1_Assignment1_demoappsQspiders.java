package Day1_assignment_demoApps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1_Assignment1_demoappsQspiders {
	@Test(groups = "regression")
	public void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui");
		// Write a script to enter data into Text field?
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("shankar");
		System.out.println(name.getAttribute("placeholder"));
		System.out.println(name.getAttribute("value"));
		driver.findElement(By.id("email")).sendKeys("Shank@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shan123");
		driver.findElement(By.xpath("//button[.='Register']")).click();
		Thread.sleep(4000);
		driver.quit();
		System.out.println("smoke");

	}

}
