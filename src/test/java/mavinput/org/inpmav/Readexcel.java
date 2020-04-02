package mavinput.org.inpmav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Users\\Rajesh Mohan\\eclipse-workspace\\inpmav\\Excel\\test.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook b= new XSSFWorkbook();
		Sheet s = b.getSheet("login");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		System.out.println(c);
		
		
		
		
		
		
	}
	
	
	
	
	
}
