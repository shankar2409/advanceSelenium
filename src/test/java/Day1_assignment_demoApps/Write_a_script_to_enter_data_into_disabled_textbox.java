package Day1_assignment_demoApps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_a_script_to_enter_data_into_disabled_textbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 * driver.get("https://demoapps.qspiders.com/ui/button?sublist=0"); // Write a
		 * script to Click On A Button ? WebElement ele = driver.findElement( By.
		 * xpath("//p[contains(text(),'1. Are you sat')]/following-sibling::button[text()='Yes']"
		 * )); ele.click(); Thread.sleep(4000); // Write a script to verify the button
		 * is clicked? if (ele.isSelected()) { System.out.println("is selectd"); } else
		 * { System.out.println("it is not selected"); } Thread.sleep(5000); Actions
		 * act=new Actions(driver); act.contextClick(ele).perform(); Thread.sleep(4000);
		 * driver.get(
		 * "https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2&scenario=4");
		 * WebElement ele1 = driver.findElement( By.
		 * xpath("//p[contains(text(),'1. Are you sat')]/following-sibling::button[text()='Yes']"
		 * )); act.doubleClick(ele1).perform(); Thread.sleep(3000);
		 * driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		 * driver.findElement(By.
		 * xpath("//p[contains(text(),'1. Are')]/../form//label[text()='Yes']")).click()
		 * ; driver.findElement(By.id("btn40")).click(); //Write a script to check
		 * button is enabled? driver.get(
		 * "https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4&scenario=7"
		 * ); WebElement cb = driver.findElement(By.
		 * xpath("//label[text()='To submit please accept our']/preceding-sibling::input"
		 * )); System.out.println(cb.isEnabled()); //links //Write a script to Click On
		 * Link Text ?
		 * driver.get("https://demoapps.qspiders.com/ui/link?sublist=0&scenario=1");
		 * driver.findElement(By.linkText("Payments")).click(); //Write a script to
		 * Click on a Link text which open in new tab
		 * driver.get("https://demoapps.qspiders.com/ui/link/linkNew?sublist=1");
		 * driver.findElement(By.linkText("About Us")).click(); //Write a script to
		 * click on all the links?
		 * driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		 * List<WebElement> links = driver.findElements(By.xpath("//a")); int count=0;
		 * for (WebElement we : links) { count++; System.out.println(we.getText()); //
		 * we.click(); // driver.navigate().back(); }
		 * System.out.println(count+" links are present"); //dropdown //How to select
		 * the value from the single select dropdown ?
		 * driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0"); WebElement
		 * country = driver.findElement(By.id("select3")); Select se=new
		 * Select(country); se.selectByValue("Canada"); //How to select the values from
		 * the Multi select dropdown ?
		 * driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1")
		 * ; WebElement multipledrop = driver.findElement(By.xpath(
		 * "//label[text()='City']/../div/select[@id='select-multiple-native']"));
		 * Select se1=new Select(multipledrop); for(int i=0;i<=3;i++) {
		 * se1.selectByIndex(i); } //Select all the valid options from all drop down and
		 * click on continue button. 
		 * 
		 */
		/*
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement multipledrop1 = driver
				.findElement(By.xpath("//label[text()='City']/../div/select[@id='select-multiple-native']"));
		Select se2 = new Select(multipledrop1);
		List<WebElement> options = se2.getOptions();
		for (WebElement we : options) {
			se2.selectByVisibleText(we.getText());
		}*/
		/*
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement multipledrop1 = driver
				.findElement(By.xpath("//label[text()='City']/../div/select[@id='select-multiple-native']"));
		Select se2 = new Select(multipledrop1);
		List<WebElement> options = se2.getOptions();
		for (WebElement we : options) {
			se2.selectByVisibleText(we.getText());
		}*/
//		driver.findElement(By.linkText("Continue")).click();

		// How to select the values from the country drop-down by using the visibletext
		/*
		 * driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0"); WebElement
		 * country = driver.findElement(By.id("select3")); // country.click(); Select
		 * se3 = new Select(country); se3.selectByIndex(3);
		 */
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		WebElement upi = driver.findElement(By.xpath("//span[.='UPI']/preceding-sibling::input"));
		upi.click();
		if (upi.isSelected()) {
			upi.clear();
		} else {

		}
	}
}
