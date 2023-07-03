package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(name="username")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement LoginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterLoginData(String email, String password)
	{
		uname.sendKeys(email);
		pass.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	
	}

}
