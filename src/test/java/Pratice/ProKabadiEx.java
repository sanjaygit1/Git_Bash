package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabadiEx {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reject All']")).click();
        driver.findElement(By.xpath("//div[@class='close-btn']")).click();
        
//        String Won = driver.findElement(By.xpath("//p[text()='UP Yoddhas']/../../../..//div[@class='table-data matches-won']")).getText();
//        System.out.println(Won);
        
//        String WON = driver.findElement(By.xpath("//p[text()='UP Yoddhas']/../../../following-sibling::div[@class='table-data matches-won']")).getText();
//        System.out.println(WON);
	
       String name = driver.findElement(By.xpath("//p[text()='84']/../preceding-sibling::div[@class='table-data team']//div[@class='team-name']")).getText();
	   System.out.println(name);
	}

}
