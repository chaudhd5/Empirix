package common;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_BasePage {

	public static WebDriver driver;
	
	public Page_BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	


	
	/*=============== Home Page Element===========
	@FindBy(xpath="")
	private WebElement input_id;
	
	@FindBy(xpath="")
	private WebElement input_pwd;
	
	@FindBy(xpath="")
	private WebElement button_SignIn;*/
}
