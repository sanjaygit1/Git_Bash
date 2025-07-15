package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Create new account']")).click();

		WebElement dateList = driver.findElement(By.id("day"));

		Select select1 = new Select(dateList);
		// select1.selectByIndex(4);
		// select1.selectByValue("20");
		// select1.selectByVisibleText("17");
		

		WebElement monthList = driver.findElement(By.id("month"));

		Select select2 = new Select(monthList);
		// select2.selectByIndex(8);
		// select2.selectByValue("9");
		// select2.selectByVisibleText("Feb");
		String month = driver.findElement(By.xpath("//option[text()='Jan']")).getText();
		
		select2.selectByContainsVisibleText(month);

		WebElement yearList = driver.findElement(By.id("year"));
		Select select3 = new Select(yearList);
		// select3.selectByIndex(29);
		// select3.selectByValue("2012");
		// select3.selectByVisibleText("2018");
//-----------------------------------------------------------------------------------------------------
		//To Fetch All the dropdown option we use getOptions()
//		List<WebElement> allOpt = select2.getOptions();
//		for (WebElement opt : allOpt)
//		{
//			System.out.println(opt.getText());
//		}
	}

}
