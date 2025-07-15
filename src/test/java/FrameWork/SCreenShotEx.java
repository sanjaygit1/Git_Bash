package FrameWork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SCreenShotEx {

	@Test
	public void m1() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./FailedScript.png");
		FileUtils.copyFile(src, dest);
	}
}
