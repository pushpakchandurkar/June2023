package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PIM_Page extends BaseClass{
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIMLink;
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement AddButton;
	
	@FindBy(name="firstName")
	private WebElement FirstName;
	
	@FindBy(name="middleName")
	private WebElement MiddleName;
	
	@FindBy(name="lastName")
	private WebElement LastName;
	
	@FindBy (xpath="//button[text()=' Save ']")
	private WebElement SaveButton;
	
	@FindBy (xpath="//a[text()='Add Employee']")
	private WebElement addEmployee;
	
	
	public PIM_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void addEmployee(String fname, String middlename, String lname) throws Exception
	{
		PIMLink.click();
		
		AddButton.click();
		
		FirstName.sendKeys(fname);
		MiddleName.sendKeys(middlename);
		LastName.sendKeys(lname);
		Thread.sleep(3000);
		SaveButton.click();
		
		addEmployee.click();
		
	}
	
	
	

}
