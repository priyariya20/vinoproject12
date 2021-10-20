package baseclass.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;

	public static WebDriver launchBrowser(String browsername) {
		switch (browsername) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		default:
			System.err.println("Invalid browser name");
			break;
			
		}
		
		return driver;
	}
	public static void implictWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	public static String getCurrentURL() {
		String url=driver.getCurrentUrl();
		return url;
		
	}
	public static String getTitle() {
		String title=driver.getTitle();
		return title;
		
	}
	public static void quitBrowser() {
		driver.quit();	
	}
	public static void btnclick(WebElement e) {
		e.click();
	}
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");	
		
	}
	public static void  moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}
	public static void fillTextBox(WebElement e,String value) {
	
	 e.sendKeys(value);
}
	//public static void sendKeys(WebElement s, String value) {
	//s.sendKeys(value);	
	//}
	public static void selectByIndex(WebElement e, int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}

	
	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	public static WebElement findElement(String locatename, String locator) {
		WebElement e=null;
		if (locatename.equals("id")) {
			e=driver.findElement(By.id(locator));
		}
		else if (locatename.equals("name")) {
			e=driver.findElement(By.name(locator));
		}
		else if (locatename.equals("xpath")) {
			e=driver.findElement(By.xpath(locator));
		}
		return e;
	}}

	

		
	
		
	

