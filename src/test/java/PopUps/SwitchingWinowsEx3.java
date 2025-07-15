package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWinowsEx3 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
		String mainWin = driver.getWindowHandle();
		Set<String> allWins = driver.getWindowHandles();// win1,win2

		for (String win : allWins) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);

			if (title.contains("Selenium"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//span[.='Documentation']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().window(mainWin);
		driver.findElement(By.xpath("//a[.='Home']")).click();
}
}
