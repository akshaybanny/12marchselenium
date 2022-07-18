package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_05_get_col_size {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\Akshay\\\\Desktop\\\\Desktop\\\\selenium12 march A\\\\excel sheet.xlsx");
		
		 short colsize = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();	
		
		System.out.println(colsize);
	
	
	

}}
