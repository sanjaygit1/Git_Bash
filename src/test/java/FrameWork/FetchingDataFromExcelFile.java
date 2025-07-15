package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelFile {

	public static void main(String[] args) throws Throwable {
	
		//step1:- path connection
		FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\Book1.xlsx");
		
		//step2:- keep excel file in read mode
		Workbook book = WorkbookFactory.create(fis);
	
		//step3:- Navigates into particular sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		//step4:-Navigates into particular row(Row value starts from 0)
		Row row = sheet.getRow(0);
	
		//step5:-Navigates into particular cell(Cell value starts from 0)
		Cell cell = row.getCell(0);
		
		String excelData = cell.getStringCellValue();
		System.out.println(excelData);
	
	}

}
