package advsele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeClassTest {
	WebDriver driver;

	@Test(groups="regrssion")
	public void chrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/search?q=poi");
		System.out.println("regression");
	}
}
