package AdvanceScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		// Handle the month List box
		WebElement monthLB = driver.findElement(By.name("Month"));

		// Select Methods
		Select monthSel = new Select(monthLB);
		monthSel.selectByIndex(2);
		Thread.sleep(1000);
		monthSel.selectByValue("Aug");
		Thread.sleep(1000);
		monthSel.selectByVisibleText("October");
		Thread.sleep(1000);

		// deselect Methods
//		monthSel.deselectByIndex(10);
//		Thread.sleep(1000);
//		monthSel.deselectAll();
	
		//isMultiple to check whether it is multi select or not
		System.out.println("Is it Multiselect?"+monthSel.isMultiple()); // true
		
		//Get the First selected option
		WebElement firstMonth = monthSel.getFirstSelectedOption();
	//	System.out.println(firstMonth.getText());

		
		//Get the All Selected Options
//		List<WebElement> allSelectedMonth = monthSel.getAllSelectedOptions();
//		System.out.println("Selected months are: ");
//		for(WebElement mon:allSelectedMonth) {
//			System.out.println(mon.getText());
//			Thread.sleep(2000);
//			}

		//Get All Options
		List<WebElement> allMonths = monthSel.getOptions();
		System.out.println("All the months available are: ");
		for(WebElement month:allMonths) {
			System.out.println(month.getText());
			Thread.sleep(2000);
		}

	}

}
