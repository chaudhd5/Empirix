package seleniumPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;

public class Page_HomePage extends Page_BasePage {

	public Page_HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	
	
	
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ayush\\Desktop\\Deepanjali\\selenium\\chromedriver.exe");

		driver = new ChromeDriver();		
	}
	
	public void LaunchURL() throws InterruptedException {
		driver.get("https://services.empirix.com/");
		Thread.sleep(10000);
		 }

	public void EnterUserName() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("QA_traininguser1");
		System.out.println("test Case Passed");
	
		}
	
	public void EnterUserPassword() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Empirix!");
		System.out.println("test Case Passed");
	}
	
	public void ClickLogin() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("test Case Passed");
	}
	
	public void verifyLoginSucessful() {
		 WebElement titlePref = driver.findElement(By.xpath("//h1[contains(text(),'Overall Performance')]"));
		 Assert.assertEquals(true, titlePref.isDisplayed());
		
	}
	
	
}
