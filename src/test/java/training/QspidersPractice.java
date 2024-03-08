package training;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class QspidersPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://demoapps.qspiders.com/ui?scenario=2");
		WebElement name = driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input"));
		System.out.println(name.getAttribute("placeholder"));
		name.sendKeys("shankar");
		System.out.println(name.getAttribute("value"));
		driver.findElement(By.xpath("//label[text()='Email Id']/following-sibling::input")).sendKeys("shankarraman1998@gmail.com");
		driver.findElement(By.xpath("//label[.='Password']/following-sibling::section/input")).sendKeys("Shan@1234");
		driver.findElement(By.linkText("Register")).click();
		driver.quit();*/
		/*driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		WebElement ele=driver.findElement(By.xpath("//p[contains(text(),'1. Are you satisfied with the registration process?')]/following-sibling::button[text()='Yes']"));
		ele.click();
		boolean b=ele.isSelected();
		if (b) {
			System.out.println("is selected");
		} else {
			System.out.println("it is not selected");
		}
		*/
		/*driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement country = driver.findElement(By.id("select3"));
//		country.click();
		Select se=new Select(country);
		List<WebElement> countryOptions = se.getOptions();
		se.selectByVisibleText("Germany");
		System.out.println(countryOptions);
		*//*
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement ele=driver.findElement(By.id("//label[text()='Country']/..//select"));
		Select se=new Select(ele);
		List<WebElement> elements = se.getOptions();
		for (WebElement webElement : elements) {
			if (!webElement.isSelected()) {
				webElement.click();
			}
		}*//*
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
	WebElement drag=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	WebElement drop	=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	
		Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop);*/
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("[ng-model='FirstName']")).sendKeys("shankar");
		driver.findElement(By.cssSelector("[ng-model='LastName']")).sendKeys("R");
		driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("tamilnadu");
		driver.findElement(By.cssSelector("//option[text()='South Africa']")).click();
			}
}
