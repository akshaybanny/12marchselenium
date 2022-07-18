package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex03 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\Akshay\\\\Desktop\\\\Desktop\\\\selenium12 march A\\\\excel sheet.xlsx");
		
		boolean src = WorkbookFactory.create(file).getSheet("sheet1").getRow(2).getCell(1).getBooleanCellValue();	
		
		System.out.println(src);
}}
