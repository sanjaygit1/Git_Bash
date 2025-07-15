package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPopupEx2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		//*** Switching Frame USing Index Value*****//
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		
		//**** switching frame using id AttributeValue ****//
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		
		//**** switching frame using name AttributeValue ****//
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Gud Mrng");
		
		//***** Switching Frame using WebElement ****//
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frameEle);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Gud noon");
	}

}
