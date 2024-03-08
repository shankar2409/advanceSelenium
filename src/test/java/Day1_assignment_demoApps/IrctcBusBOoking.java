package Day1_assignment_demoApps;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IrctcBusBOoking {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[normalize-space(text())='BUSES']")).click();
		Set<String> allId = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		allId.remove(parentId);
		for (String str : allId) {
			driver.switchTo().window(str);
		}
		
		 driver.findElement(By.id("departFrom")).sendKeys("benga");
		 List<WebElement> from = driver.findElements(By.cssSelector("[class='ui-menu-item-wrapper']"));
		 for (WebElement we : from) {
			if (we.getText().contains("bengaluru")) {
				we.click();
				break;
			}
		}
//		driver.findElement(By.xpath("//div[.='Bengaluru']")).click();
		WebElement to = driver.findElement(By.id("goingTo"));
		to.sendKeys("chenn");
		List<WebElement> arrival = driver.findElements(By.cssSelector("[class='ui-menu-item-wrapper']"));
		for (WebElement we : arrival) {
			if (we.getText().contains("Chennai")) {
				we.click();
				break;
			}
		}
//		driver.findElement(By.xpath("//div[.='Chennai']")).click();
		
		driver.findElement(By.xpath("//span[.='February']//ancestor::div[@id='ui-datepicker-div']//a[.='4']")).click();
		driver.findElement(By.xpath("//button[normalize-space(text())='Search Bus']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[.='Departure Time']/..//label[.='After 6 pm']")).click();
		driver.findElement(By.xpath("//label[.='VJS Travels']/ancestor::div[@id='accordionExample']/descendant::button[.='Select Seat']")).click();
		driver.findElement(By.cssSelector("[title='Seat No. : L25 | Fare : INR 922.95']")).click();
		driver.findElement(By.xpath("//p[.='Silk Board']/ancestor::tr/descendant::input")).click();
		driver.findElement(By.xpath("//p[.='Vanagaram']/ancestor::tr/descendant::input")).click();
		driver.findElement(By.xpath("//button[.='Proceed to Book']")).click();
		driver.findElement(By.id("profile-tab")).click();
		driver.findElement(By.id("emailLogin")).sendKeys("shankarraman1998@gmail.com");
		driver.findElement(By.id("phoneLogin")).sendKeys("9698422141");
		driver.findElement(By.xpath("(//button[.='Login'])[2]")).click();
		
		driver.findElement(By.name("mobileno")).sendKeys("9698422141");
		driver.findElement(By.name("address")).sendKeys("chennai");
		WebElement country = driver.findElement(By.name("country"));
		Select se=new Select(country);
		se.selectByValue("India");
		WebElement state = driver.findElement(By.name("state"));
		Select se1=new Select(state);
		se1.selectByVisibleText("TAMIL NADU");
		driver.findElement(By.name("pincode")).sendKeys("600001");
		driver.findElement(By.cssSelector("[placeholder='Traveller Name']")).sendKeys("shnakar");
		WebElement gender = driver.findElement(By.name("select"));
		Select se2=new Select(gender);
		se2.selectByVisibleText("Male");
		driver.findElement(By.cssSelector("[placeholder='Age']")).sendKeys("26");
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.xpath("//button[.='Continue to Book ']")).click();
	}

}
