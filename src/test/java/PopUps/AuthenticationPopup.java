package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		
//		In real time there will be some websites/Applications which will get access after providing username and password. so the popup which ask for 
//		username and password is called as Authentication popup
		
		//Characteristics
		//*This popup cant be inspect(webdriver methods are webelement methods cant be used)
		//*This popup cant be draggable

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//   driver.get("https://the-internet.herokuapp.com/basic_auth");
		
	//syntax:---->	driver.get("https://Username:Password@URL");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
