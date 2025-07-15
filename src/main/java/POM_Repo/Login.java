package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login {
//hello
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	@FindBys({@FindBy(id="user-name"),@FindBy(name="user-name")})
	@FindAll({@FindBy(id="user-name"),@FindBy(name="user-name")})
	private WebElement UserTextField;
	
	@FindAll({@FindBy(css = "[type='password']"),@FindBy(name="password")})
	private WebElement PassWordTextField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;

	//getter methods
	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPassWordTextField() {
		return PassWordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void LoginToApp(String UserNAme,String PassWOrd)
	{
		UserTextField.sendKeys(UserNAme);
		PassWordTextField.sendKeys(PassWOrd);
		loginButton.click();
	}
	
}
