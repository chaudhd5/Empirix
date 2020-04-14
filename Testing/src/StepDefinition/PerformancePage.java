package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PerformancePage {

	WebDriver driver;

@Given("^User is at Performance Page$")
public void user_is_at_Performance_Page() {
    // Write code here that turns the phrase above into concrete actions
	 WebElement titlePref = driver.findElement(By.xpath("//h1[contains(text(),'Overall Performance')]"));
	 Assert.assertEquals(true, titlePref.isDisplayed());
	
}

@When("^User Click on Profile Drop down$")
public void user_Click_on_Profile_Drop_down() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("li[@class='dropdown']")).click();
}

@When("^User Select Japanese Language$")
public void user_Select_Japanese_Language() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("*[contains(text(),'Japanese')]")).click();
	//*[contains(text(),'Japanese')]
	//*[contains(text(),'English')]
	//*[contains(text(),'変数') or contains(text(),'Alerts')]
	//*[contains(text(),'変数') or contains(text(),'Variable')]
	
	//*[contains(text(),'通知') or contains(text(),'Notifications')]
	
}

@Then("^User Language should be changed to Japanese$")
public void user_Language_should_be_changed_to_Japanese() {
    // Write code here that turns the phrase above into concrete actions
	WebElement alt = driver.findElement(By.xpath("//*[contains(text(),'変数')]"));
	 Assert.assertEquals(true, alt.isDisplayed());
}

@When("^User Select English Language$")
public void user_Select_English_Language() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("*[contains(text(),'Japanese')]")).click();
	
}

@Then("^User Language should be changed to English$")
public void user_Language_should_be_changed_to_English() {
    // Write code here that turns the phrase above into concrete actions
	WebElement alte = driver.findElement(By.xpath("//*[contains(text(),'Alerts')]"));
	 Assert.assertEquals(true, alte.isDisplayed());
}

@When("^User Navigate to Alert tab$")
public void user_Navigate_to_Alert_tab() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[contains(text(),'Alerts')]")).click();

}

@Then("^User should be Navigated to alert tab successfully$")
public void user_should_be_Navigated_to_alert_tab_successfully() {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("^User Navigate to Test tab$")
public void user_Navigate_to_Test_tab() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^User should be Navigated to Test tab successfully$")
public void user_should_be_Navigated_to_Test_tab_successfully() {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("^User Navigate to Variables tab$")
public void user_Navigate_to_Variables_tab() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^User should be Navigated to Variables tab successfully$")
public void user_should_be_Navigated_to_Variables_tab_successfully() {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("^User Navigate to Notifications tab$")
public void user_Navigate_to_Notifications_tab() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^User should be Navigated to Notifications tab successfully$")
public void user_should_be_Navigated_to_Notifications_tab_successfully() {
    // Write code here that turns the phrase above into concrete actions
   
}


}


