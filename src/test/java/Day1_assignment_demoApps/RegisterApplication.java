package Day1_assignment_demoApps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterApplication {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.cssSelector("[placeholder=\"First Name\"]")).sendKeys("shankar");
	driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("ramam");
	driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("4/4,uthandiyur,erode,tamilnadu");
	driver.findElement(By.cssSelector("[ng-model='EmailAdress']")).sendKeys("shankarraman1998@gmail.com");
	driver.findElement(By.xpath("//label[.='Phone*']/following-sibling::div/input")).sendKeys("9347384927");
	driver.findElement(By.cssSelector("[value='Male']")).click();
	driver.findElement(By.xpath("//label[normalize-space(text())='Movies']/preceding-sibling::input")).click();
	driver.findElement(By.id("msdd")).click();
	List<WebElement> lang = driver.findElements(By.cssSelector("[class*='ui-front ui-men']"));
	int count=0;
	for (WebElement we : lang) {
		System.out.println(we.getText());
		while(count<=4) {
			we.click();
			count++;
		}
	}
	
	WebElement skill = driver.findElement(By.id("Skills"));
	Select se=new Select(skill);
	se.selectByValue("Adobe Photoshop");
	
}
}
