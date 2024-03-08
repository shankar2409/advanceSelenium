package advsele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classss {
	@Test
	public void AccessDownload() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("chrome://downloads/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*js.executeScript("document.querySelector(\"[class='focus-outline-visible']\")"
				+ ".querySelector(\"downloads-manager\")"
				+ ".shadowRoot.querySelector(\"downloads-toolbar[id='toolbar']\")"
				+ ".shadowRoot.querySelector(\"cr-toolbar[page-name='Downloads']\")"
				+ ".shadowRoot.querySelector(\"[id='search']\")"
				+ ".shadowRoot.querySelector(\"input[id='searchInput']\")"
				+ ".value=\"hii shubam broo doneee\"");*/
		WebElement searchTF = driver.findElement(By.cssSelector("[class='focus-outline-visible']"))
		.findElement(By.cssSelector("downloads-manager"))
		.getShadowRoot().findElement(By.cssSelector("downloads-toolbar[id='toolbar']"))
		.getShadowRoot().findElement(By.cssSelector("cr-toolbar[page-name='Downloads']"))
		.getShadowRoot().findElement(By.cssSelector("[id='search']"))
		.getShadowRoot().findElement(By.cssSelector("input[id='searchInput']"));
		searchTF.clear();
		searchTF.sendKeys("hiii bro");
		
	}
}
