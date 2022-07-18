package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_all_data_of_sheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		
		int lastrow = sh.getLastRowNum();
		for(int i=0;i<=lastrow;i++) {
			int lastcol = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastcol;j++) {
		String val = sh.getRow(i).getCell(j).getStringCellValue();
		System.out.print(val+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
