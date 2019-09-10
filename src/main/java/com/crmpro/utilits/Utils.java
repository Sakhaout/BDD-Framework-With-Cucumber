package com.crmpro.utilits;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crmpro.ParentPageClass.BasePage;

public class Utils extends BasePage {
private static Logger log = Logger.getLogger(Utils.class);
	
	public Utils() {
		super();
	}

	public static int Page_Load_TimeOut = 30;
	public static int Implicitly_Wait = 20;
	
	//This method will take Screenshot
	public static final void takeScreenshot(String fileName){
		log.info("\tTaking screenshot of "+fileName);
		//Take screenshot by using TakesScreenshot interface and store it into file.
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy that screenshot to a desire location by using copyFile() method of FileUtils class.
		try {
			FileUtils.copyFile(file, new File(currentDirectory + "/Screenshot/"+fileName +".jpg"));
			log.info("\tScreenshot has been taken.");
		} catch (IOException e) {
			log.error(e.getStackTrace() +"\\tFailed to take screenshot.");
		}

	}
	
	//This method will read data from a specific cell.
	@SuppressWarnings("resource")
	public final String readExcelFile(int rowNumber, int collumNumber) throws FileNotFoundException, IOException{
		String readData;
		String files = currentDirectory + "/src/resource/java/testData.xlsx";  // Excel file path.
		FileInputStream FileInput = new FileInputStream(files); //Create object of FileInputStream class, and set file path in parameter.
		//Create object of Workbook of excel file.
		XSSFWorkbook workbook = new XSSFWorkbook(FileInput);
		//get sheet number of that workbook.
		XSSFSheet sheet = workbook.getSheetAt(0);
		//get row and collum number from the sheet.
		readData = sheet.getRow(rowNumber).getCell(collumNumber).toString();
		return readData; //return cell value.

	}
	
	
	//This method will read a list of data from excel file. 
	public ArrayList<String> readExcelfile(int collumn) throws IOException {
		log.info("\tGetting test-data from Excel file.");
		String file = currentDirectory + "/src/resource/java/testData.xlsx";
		// First need to create an object of FileInputStream class.
		FileInputStream fileInput = new FileInputStream(file);
		//Create object for an workbook of that file.
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		//Use XSSFSheet to get the sheet of that workbook.
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		log.debug("\tGet sheet name of excel file.");
		//Iterate in the row of the selected sheet.
		Iterator <Row> rowItr = sheet.iterator();
		rowItr.next(); //Skep the first row.
		//Store all data in a list.
		ArrayList<String>list = new ArrayList<String>();
		while(rowItr.hasNext()){
			list.add(rowItr.next().getCell(collumn).getStringCellValue());
		}
		
		return list;
	}
	

}
