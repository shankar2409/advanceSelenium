package training;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		mutliModel();
	}

	public static void alertss() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 * driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		 * driver.findElement(By.id("buttonAlert2")).click(); Alert alrt =
		 * driver.switchTo().alert(); System.out.println(alrt.getText()); alrt.accept();
		 */
		/*
		 * driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		 * driver.findElement(By.id("buttonAlert5")).click(); Alert alrt =
		 * driver.switchTo().alert(); System.out.println(alrt.getText());
		 * alrt.dismiss();
		 */

		/*
		 * driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		 * driver.findElement(By.id("buttonAlert1")).click(); Alert alrt =
		 * driver.switchTo().alert(); alrt.sendKeys("yes"); alrt.accept(); String op =
		 * driver.findElement(By.xpath("//p[@class='pt-2 text-center']")).getText(); if
		 * (op.contains("yes")) { System.out.println("you selected yes"); } else {
		 * System.out.println("you selected no"); }
		 */
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();

		driver.findElement(By.partialLinkText("Alert with OK & ")).click();
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		Alert alrt1 = driver.switchTo().alert();
		alrt1.dismiss();
		System.out.println(driver.findElement(By.id("demo")).getText());

		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
		Alert alrt2 = driver.switchTo().alert();
		alrt2.sendKeys("shankar");
		alrt2.accept();
		System.out.println(driver.findElement(By.id("demo1")).getText());

	}

	public static void notificationPopupAndCHildWindow() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
//		driver.findElement(By.id("browNotButton")).click();
		driver.findElement(By.partialLinkText("BUSES")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		allId.remove(parentId);
		for (String id : allId) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if (url.contains("https://www.bus.irctc.co.in/home")) {
				break;
			}
		}
		Thread.sleep(3000);
		WebElement depart = driver.findElement(By.id("departFrom"));
		depart.sendKeys("beng");
		driver.findElement(By.xpath("//div[.='Bengaluru']")).click();
		WebElement arrival = driver.findElement(By.id("goingTo"));
		arrival.sendKeys("salem");
		driver.findElement(By.xpath("//div[.='Salem']")).click();
	}

	public static void childWindow() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.id("browserLink1")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		allId.remove(parentId);
		for (String str : allId) {
			String url = driver.switchTo().window(str).getCurrentUrl();
			if (url.contains("https://demoapps.qspiders.com/ui/browser/SignUpPage")) {
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("shankar");
	}
	public static void newTab() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
		driver.findElement(By.id("browserButton4")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allID = driver.getWindowHandles();
		allID.remove(parentId);
		for (String str : allID) {
			String title = driver.switchTo().window(str).getTitle();
			if (title.contains("https://demoapps.qspiders.com/ui/browser/SignUpPage")) {
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Shankar");
	}
	public static void multipleWindow() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		driver.findElement(By.id("browserButton3")).click();
		String parentid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		allid.remove(parentid);
	;
	}
	public static void newMlutipleTab() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.id("browserButton2")).click();
		String pi = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		allId.remove(pi);
		for (String str : allId) {
			String url = driver.switchTo().window(str).getCurrentUrl();
			if (url.contains("https://demoapps.qspiders.com/ui/browser/SignUpPage")) {
				break;
			}
		}
		Thread.sleep(3000);
		String password="shan@1234";
		driver.findElement(By.id("email")).sendKeys("shankar@gmail.com");
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirm-password")).sendKeys(password);
//		driver.findElement(By.xpath("//button")).click();
		driver.switchTo().window(pi);
		WebElement impNote = driver.findElement(By.xpath("//p[.='Important Note:']/following-sibling::p"));
		System.out.println(impNote.getText());
	}
	public static void micTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("use-fake-device-for-media-stream");
		options.addArguments("use-fake-ui-for-media-stream");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mictests.com/");
		driver.findElement(By.id("mic-launcher")).click();
	}
	public static void authPopup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
//		driver.findElement(By.id("AuthLink")).click();
		String username="admin",password="admin";
		String url="https://"+username+":"+password+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
		driver.get(url);
	}
	public static void modalPopup() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/modal?sublist=0");
		driver.findElement(By.id("modal1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("closeModal")).click();
	}

	public static void mutliModel() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
		driver.findElement(By.id("multiModalButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("multiClosemodal")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("multiclose2")).click();
	}

}
