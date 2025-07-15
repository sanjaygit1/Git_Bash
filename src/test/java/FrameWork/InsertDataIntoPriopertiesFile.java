package FrameWork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertDataIntoPriopertiesFile {

	public static void main(String[] args) throws Throwable {

		Properties pro = new Properties();

		pro.setProperty("url", "https://www.flipkart.com");

		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shobha\\Downloads\\commondata.properties");
		pro.store(fos, "commonData");
		System.out.println("Data inserted");
	}

}

