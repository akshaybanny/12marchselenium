package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_10 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
	
		
	   short lastcell = sh.getRow(0).getLastCellNum();
	
		for(int i=0;i<=lastcell;i++) {
			
			String row = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.print(row+" ");
		}
               
               
               
               
               
               
               
               
               
	}

}
