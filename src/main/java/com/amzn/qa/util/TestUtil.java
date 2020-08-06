package com.amzn.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;

public class TestUtil {
public static long PAGE_LOAD_TIMEOUT=20;
public static long IMPLICIT_WAIT=10;

public static String TestData="/Users/pujakumari/Documents/workspace/AmazonTest/src/main/java/com/amzn/qa/testdata/WebOrders.xlsx";
static  XSSFWorkbook book;
static Sheet sheet;

public static Object[][] getTestData(String sheetname) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException{
	FileInputStream file=null;
	try{
	file=new FileInputStream(TestData);
	}
	catch(FileNotFoundException nfe){
		nfe.printStackTrace();
	}
	try{
		book=(XSSFWorkbook) WorkbookFactory.create(file);
		
	}
	catch(IOException e){
		e.printStackTrace();
	}
sheet=(Sheet) book.getSheet(sheetname);
Object[][] data=new Object[((XSSFSheet) sheet).getLastRowNum()][((XSSFSheet) sheet).getRow(0).getLastCellNum()];
for(int i=0;i<((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum();i++){
	for(int k=0;k<((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getLastCellNum();k++){
		data[i][k]=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(i+1).getCell(k).toString();
	}
}
return data;

}

}
