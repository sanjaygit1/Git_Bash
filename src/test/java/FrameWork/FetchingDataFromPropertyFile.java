package FrameWork;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repo.LoginPage;

public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {

		// step1:- path connection
		// when reading data from local device
//		FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\commondata.properties");
		
		//when the file is present with in a project
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");

		// step2:-load all the keys into properties class
		Properties pro = new Properties();
		pro.load(fis);

		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
 
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
//		driver.findElement(By.name("user-name")).sendKeys(USERNAME);
//		driver.findElement(By.name("password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("login-button")).click();
		
		LoginPage login = new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);
	}

}
