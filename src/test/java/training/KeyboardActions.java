package training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=1");
		Robot r = new Robot();
//		WebElement ele = driver.findElement(By.id("email"));
		minizeCodeForRobot(r);
		/*
		 * Write a script to enter values to text field using Robot class?
		 * r.keyPress(KeyEvent.VK_S); r.keyRelease(KeyEvent.VK_S);
		 * r.keyPress(KeyEvent.VK_H); r.keyRelease(KeyEvent.VK_H);
		 * r.keyPress(KeyEvent.VK_A); r.keyRelease(KeyEvent.VK_A);
		 * r.keyPress(KeyEvent.VK_N); r.keyRelease(KeyEvent.VK_N);
		 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
		 */

		/*
		 * 
		 * 
		 * Write a script to enter values to text field using Action class? Actions
		 * act=new Actions(driver);
		 * act.moveToElement(ele).click().sendKeys("shankar@gmail.com",Keys.ENTER).
		 * perform();
		 */
		/*
		 * ele.click(); r.keyPress(KeyEvent.VK_CAPS_LOCK);
		 * r.keyRelease(KeyEvent.VK_CAPS_LOCK); r.keyPress(KeyEvent.VK_S);
		 * r.keyRelease(KeyEvent.VK_S); r.keyPress(KeyEvent.VK_H);
		 * r.keyRelease(KeyEvent.VK_H); r.keyPress(KeyEvent.VK_A);
		 * r.keyRelease(KeyEvent.VK_A);
		 */

		/*
		 * ele.click(); r.keyPress(KeyEvent.VK_S); r.keyRelease(KeyEvent.VK_S);
		 * r.keyPress(KeyEvent.VK_H); r.keyRelease(KeyEvent.VK_H);
		 * r.keyPress(KeyEvent.VK_A); r.keyRelease(KeyEvent.VK_A);
		 */

		/*
		driver.findElement(By.id("password")).sendKeys("shankar");
		WebElement target = driver.findElement(By.id("confirmPassword"));
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);*/
		
	
	}
	public static void minizeCodeForRobot(Robot r) {
	char[] c = "shankar".toCharArray();
	for(int i=0;i<c.length;i++) {
		int key = KeyEvent.getExtendedKeyCodeForChar(c[i]); 
		r.keyPress(key);
		r.keyRelease(key);
		
		
	}
	}
}
