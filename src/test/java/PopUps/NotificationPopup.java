package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
//		
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
//		
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

}
