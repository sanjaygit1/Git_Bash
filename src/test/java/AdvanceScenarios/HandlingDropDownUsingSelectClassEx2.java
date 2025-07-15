package AdvanceScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClassEx2 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement monthNames = driver.findElement(By.name("Month"));

		// Select Methods
		Select select = new Select(monthNames);
		select.selectByIndex(2);
//		Thread.sleep(1000);
//		select.selectByValue("June");
//		Thread.sleep(1000);
//		select.selectByVisibleText("November");
//		Thread.sleep(1000);

		String month = driver.findElement(By.xpath("//option[@value='Sept']")).getText();
		select.selectByContainsVisibleText(month);
		Thread.sleep(2000);
		select.deSelectByContainsVisibleText(month);

		// deSelect methods
//		select.deselectByIndex(6);
//        Thread.sleep(1000);
//		select.deselectByValue("Nov");
//		Thread.sleep(1000);
//		select.deselectByVisibleText("February");

//		select.deselectAll();

		// ***---------isMultiple() to check whether it is multi Select or
		// not---------***
//		System.out.println("is it multiSelect---->"+select.isMultiple());

		// ***----------getFirstSelectedOption() fetches the first selected
		// option----****
//		WebElement opt = select.getFirstSelectedOption();
//        System.out.println(opt.getText());

		// ***----------getAllSelectedOptions fetches multi selected options-------****
//		List<WebElement> allSelected = select.getAllSelectedOptions();
//        System.out.println("Selected months are : ");
//        for (WebElement selectedMonths : allSelected)
//        {
//			System.out.println(selectedMonths.getText());
//			Thread.sleep(1000);
//		}

		// To Fetch All the dropdown option we use getOptions()
//				List<WebElement> allOpt = select.getOptions();
//				for (WebElement opt : allOpt)
//				{
//					System.out.println(opt.getText());
//				}

	}

}
