package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex_12_pp_of_akii {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet4");
		int lastrow = sh.getLastRowNum();
		
		for(int i=0;i<=lastrow;i++) {
		  int col = sh.getRow(i).getLastCellNum()-1;
		  for(int j=0;j<=col;j++) {
			  Cell cellinfo = sh.getRow(i).getCell(j);
			 CellType s1 = cellinfo.getCellType();
			 if(s1==CellType.STRING) {
				 System.out.print(cellinfo.getStringCellValue()+" ");
			 }
			 else if(s1==CellType.NUMERIC) {
            	 System.out.print(cellinfo.getNumericCellValue()+" ");
			 }
             else if(s1==CellType.BOOLEAN) {
            	System.out.print(cellinfo.getBooleanCellValue()+" ");
			 }
			 
			 
		  }
		  System.out.println();
		  
		  
		}
		
	
		
		
		
	}

}
