package StepDefination;

import org.testng.Assert;

import PageLayer.HomePage;
import io.cucumber.java.en.Given;

public class HomePageStepDef {
	
	private static HomePage homepage;
	@Given("user should be on home page and validate title")
	public void user_should_be_on_home_page_and_validate_title() {
		homepage = new HomePage();
		
		Assert.assertEquals(homepage.validateTitle(), "OrangeHRM");
		
		
		
	    
	}
	
	
	@Given("validate home page URL")
	public void validate_home_page_url() {
		
		Assert.assertEquals(homepage.validateURL().contains("dashboard/index"), true);
	   
	}

}
