package Day1_assignment_demoApps;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KayakFlightSearch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.kayak.co.in/");
		driver.findElement(By.xpath("//div[.='Flights']")).click();
	//	System.out.println("url"+driver.getCurrentUrl());
		WebElement from = driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
		from.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,"chennai");
		driver.findElement(By.xpath("//input[@class='PVIO-input']")).click();
		driver.findElement(By.cssSelector("[class='k_my-input'][placeholder='To?']")).sendKeys(Keys.BACK_SPACE,"bengaluru");
		driver.findElement(By.xpath("(//input[@class=\"PVIO-input\"])[2]")).click();
		driver.findElement(By.cssSelector("[aria-label='Start date calendar input'] [class='sR_k-value']")).click();
//		driver.findElement(By.cssSelector("[aria-label='Thursday 4 April, 2024']")).click();
//		driver.findElement(By.cssSelector("[aria-label='End date calendar input'] [class='sR_k-value']")).click();
		driver.findElement(By.cssSelector("[aria-label='Friday 19 April, 2024']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("[class*='zEiP-submit']")).click();
		System.out.println(driver.getTitle());
	Set<String> allId = driver.getWindowHandles();
	for (String string : allId) {
		driver.switchTo().window(string);
		String title = driver.getTitle();
		if(title.contains("Book now"))
		{
			break;
		}
	}
//		String parentId = driver.getWindowHandle();
//		System.out.println(parentId);
//		System.out.println(allId.toString());
//		
//		allId.remove(parentId);
//		for (String str : allId) {
//			driver.switchTo().window(str);
//		}
//		System.out.println("url"+driver.getCurrentUrl());
//		driver.get("https://www.kayak.co.in/flights/MAA-BLR/2024-04-03/2024-04-19?sort=bestflight_a");
	
		try {
			driver.findElement(By.cssSelector("[class=\"Hv20-option Hv20-mod-state-active\"]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<WebElement> price = driver.findElements(By.cssSelector("[class=\"f8F1-price-text\"]"));
//		LinkedList<String> prices=new LinkedList<String>();
		for (WebElement we : price) {
			System.out.println(we.getText());
//			prices.add(we.getText());
		}
//		System.out.println(prices.toString());
		driver.manage().deleteAllCookies();
	}

}
