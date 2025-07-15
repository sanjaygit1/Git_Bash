package FrameWork;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.sourceforge.tess4j.Tesseract;

public class CaptchaHandling {

	public static void main(String[] args) throws Throwable {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");

		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
		
		WebElement captchaEle = driver.findElement(By.className("captcha-img"));
		
		TakesScreenshot ts = (TakesScreenshot)captchaEle;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./captchaImg.png");
        FileUtils.copyFile(src, dest);
        
        Tesseract tss = new Tesseract();
       tss.setDatapath("C:\\Users\\Shobha\\Downloads\\Tess4J-3.4.8-src (9)\\Tess4J\\tessdata"); 
       String ele = tss.doOCR(dest);
      String finalCatpcha = ele.replace(" ", "");
      System.out.println(finalCatpcha);
      
      driver.findElement(By.id("captcha")).sendKeys(finalCatpcha);
        
        
        
        
        
	}

}
