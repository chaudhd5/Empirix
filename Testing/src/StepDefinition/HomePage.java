package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_HomePage;

public class HomePage {

	@Given("^User is at Empirix home page$")
	public void user_is_at_Empirix_home_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Page_HomePage PHP = new Page_HomePage(null);
		
		PHP.LaunchBrowser();
		PHP.LaunchURL();
	//	PHP.EnterCredentiatls();
		
	}

	@When("^User Enter User Name$")
	public void user_Enter_User_Name() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Page_HomePage PHP = new Page_HomePage(null);		
		PHP.EnterUserName();
	}

	@When("^User Enter Password$")
	public void user_Enter_Password() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Page_HomePage PHP = new Page_HomePage(null);		
		PHP.EnterUserPassword();
	}

	
	@When("^Click on Login$")
	public void click_On_Login() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Page_HomePage PHP = new Page_HomePage(null);		
		PHP.ClickLogin();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Page_HomePage PHP = new Page_HomePage(null);	
		PHP.verifyLoginSucessful();
	}



}
