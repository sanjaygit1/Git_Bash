package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramePopUp {

	public static void main(String[] args) {

		// iframe:---->single frame
		// frame :---->Nested frame
		/**
		 * Approaches:- Switching frames using index------>Index value starts from 0
		 * Switching frames using id or name attribute 
		 * Switching frames using WebElement
		 */

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
	}

}
