package StepDefination;

import java.util.List;
import java.util.Map;

import PageLayer.PIM_Page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PIMPageStepDef {
	
	private static PIM_Page pimpage;
	
	@Given("user is on PIM on page")
	public void user_is_on_pim_on_page() {
		
		pimpage = new PIM_Page();
		
	   
	}
	
	
	@When("user click on Add button and enter fname, lname, mname and click on save button")
	public void user_click_on_add_button_and_enter_fname_lname_mname_and_click_on_save_button(DataTable dataTable) throws Exception {
		
		List<Map<String, String>>  ls = dataTable.asMaps();
		
		for(int i=0; i<ls.size();i++)
		{
		String name = ls.get(i).get("firstname");
		String middlename = ls.get(i).get("mname");
		String lname = ls.get(i).get("lastname");
		
		
		pimpage.addEmployee(name, middlename, lname);
		}
		
	    
	}


}
