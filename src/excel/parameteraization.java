package excel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parameteraization {
	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet s=book.getSheet("sheet1");
		String value = s.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		
		
		
		
	}

}
