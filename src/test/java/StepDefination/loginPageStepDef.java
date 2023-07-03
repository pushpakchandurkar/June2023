package StepDefination;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageStepDef extends BaseClass {
	
	private static LoginPage loginpage;
	
	@Given("user should be on Login Page")
	public void user_should_be_on_login_page() {
		BaseClass.initiization();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}
	
	
	@When("user enter valid userid and password")
	public void user_enter_valid_userid_and_password(DataTable dataTable) {
	   
		loginpage = new LoginPage();
		
		//List<List<String>> ls = dataTable.cells();
		List<List<String>> ls = dataTable.asLists();
		
		String id = ls.get(0).get(0);
		String password = ls.get(0).get(1);
		
		loginpage.enterLoginData(id, password);
		
	}
	
	
	@Then("user click on login button")
	public void user_click_on_login_button() {
	   
		loginpage.clickOnLoginButton();
		
	}

}
