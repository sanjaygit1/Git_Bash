package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopup {

	@Test
	public void alert() {

//		Alert Popup
//		* It is also called Confirmation popup/Javascript Popup
//		* This popups are undraggable
//		* As this popup are uninspectable so webdriver cannot handle it directly.

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
//      Alert alt = driver.switchTo().alert();
//		alt.accept();

//		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
//		driver.switchTo().alert().accept();//To click ok Button ----->accept()
//		driver.switchTo().alert().dismiss();//To click on Cancel button---->dismiss()
		
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
	
		alt.sendKeys("Hi im Alert");
		alt.accept();
	
	}

}
