package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_08_print_all_column_data {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\\\\\\\Users\\\\\\\\Akshay\\\\\\\\Desktop\\\\\\\\Desktop\\\\\\\\selenium12 march A\\\\\\\\excel sheet.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");

		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0;i<=lastrowindex;i++) {
			String val = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
}}
