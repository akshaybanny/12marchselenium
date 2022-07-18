package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_07_print_all_data_row {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\\\\\\\Users\\\\\\\\Akshay\\\\\\\\Desktop\\\\\\\\Desktop\\\\\\\\selenium12 march A\\\\\\\\excel sheet.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");

                       int lastcellindex = sh.getRow(0).getLastCellNum()-1;

                  for(int i=0;i<=lastcellindex;i++) {
                	  String value = sh.getRow(0).getCell(i).getStringCellValue();
                	  System.out.print(value+" ");
                  }













}}











