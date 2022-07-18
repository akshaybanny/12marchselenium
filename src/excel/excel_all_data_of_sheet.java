package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.examples.hssf.usermodel.CellTypes;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_all_data_of_sheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\new sheet 12.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		int lastrow = sh.getLastRowNum();
		
		for(int i=0;i<=lastrow;i++) {
			int lascol = sh.getRow(0).getLastCellNum()-1;
			for(int j=0;j<=lascol;j++) {
				Cell cellinfo = sh.getRow(i).getCell(j);
				CellType s2= cellinfo.getCellType();
			
	        
		
		
			if(s2==CellType.STRING) {
	        	System.out.print(cellinfo.getStringCellValue()+" ");
	        }
			else if(s2==CellType.BOOLEAN) {
	        	System.out.print(cellinfo.getBooleanCellValue()+" ");
	        }
			else if(s2==CellType.NUMERIC) {
	        	System.out.print(cellinfo.getNumericCellValue()+" ");
	        }
		}
	System.out.println();
			
		}
		
		
	}

}
