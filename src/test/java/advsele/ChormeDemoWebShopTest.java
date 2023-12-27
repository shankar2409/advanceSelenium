package advsele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChormeDemoWebShopTest {
	WebDriver driver;

	@Test
	public void chromeDemoWebShop() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/cart");
	}
}
