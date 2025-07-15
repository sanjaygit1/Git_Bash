package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// For Every POM class create Constructor to get an Object of the POM class ,
	// inside the Constructor use Pagefactory.initElement()
	// to initialize the Page Elements at the time Object creation,
	// in order to initialize all the page Elements we should use
	// Pagefactory.initElement()
	// (Element initialization)
	
	// initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Declartion
	@FindBy(id = "user-name")
	private WebElement UserTextField;

	@FindBy(css = "[name='password']")
	private WebElement PassWordTextField;

	@FindBy(id = "login-button")
	private WebElement loginButton;

	// getter methods
	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPassWordTextField() {
		return PassWordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	//Business Logics
	
	public void loginToApp(String UserName,String PassWord)
	{
		UserTextField.sendKeys(UserName);
		PassWordTextField.sendKeys(PassWord);
		loginButton.click();
		
	}
	
}
