package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMultipleWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[.='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();

		String mainWIn = driver.getWindowHandle();
		
		Set<String> allWins = driver.getWindowHandles();

		for (String win : allWins) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);

			if (title.contains("Index")) {
				break;
			}
		}

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		// ----------------------------------------------------------------------------------------------------------------------------------
		Set<String> allWin1 = driver.getWindowHandles();
		for (String win1 : allWins) {
			driver.switchTo().window(win1);
			String title1 = driver.getTitle();
			System.out.println(title1);
			if (title1.contains("Selenium")) {
				break;
			}
		}
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		//-----------------------------------------------------------------------------------------------------------------------
//	    driver.switchTo().window(mainWIn);
//	    driver.findElement(By.xpath("//a[.='Home']")).click();
		
		//or
		
		for (String win1 : allWins) {
			driver.switchTo().window(win1);
			String title1 = driver.getTitle();
			System.out.println(title1);
			if (title1.contains("Frames & windows")) {
				break;
			}
		}
		 driver.findElement(By.xpath("//a[.='Home']")).click();
		 
//			driver.close();//------>closes single win/tab where driver is currently in focus
			driver.quit();//------>closes all the wins/tabs including browser
		
	}

}
