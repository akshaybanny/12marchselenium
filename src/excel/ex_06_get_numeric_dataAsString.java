package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_06_get_numeric_dataAsString {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\\\\\\\Users\\\\\\\\Akshay\\\\\\\\Desktop\\\\\\\\Desktop\\\\\\\\selenium12 march A\\\\\\\\excel sheet.xlsx");
		
		 String value = WorkbookFactory.create(file).getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	
	
	
	
	
	
	
	
	
	
}}
