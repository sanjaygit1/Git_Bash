package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNativePopup {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.puma.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
