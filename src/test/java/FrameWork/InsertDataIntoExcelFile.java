package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataIntoExcelFile {

	public static void main(String[] args) throws Throwable {

		// step1:- path connection
		FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\Book1.xlsx");

		// step2:- keep excel file in read mode
		Workbook book = WorkbookFactory.create(fis);

		// step3:- Navigates into particular sheet
		Sheet sheet = book.getSheet("Sheet1");

		Row row = sheet.createRow(2);

		Cell cell = row.createCell(3);

		cell.setCellValue("Shobha");

		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shobha\\Downloads\\Book1.xlsx");
		book.write(fos);
		book.close();

	}

}
