package FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repo.Login;
import POM_Repo.LoginPage;

public class POM_IMP {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");

		// Normal Approach
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();

		// POM Implementation using getter methods
//		LoginPage login = new LoginPage(driver);
//		login.getUserTextField().sendKeys("standard_user");
//      login.getPassWordTextField().sendKeys("secret_sauce");
//		login.getLoginButton().click();

		// POM Implementation using Business Logics
//		LoginPage login = new LoginPage(driver);
//		login.loginToApp("standard_user", "secret_sauce");
		
		Login log = new Login(driver);
		log.LoginToApp("standard_user", "secret_sauce");
	}

}
