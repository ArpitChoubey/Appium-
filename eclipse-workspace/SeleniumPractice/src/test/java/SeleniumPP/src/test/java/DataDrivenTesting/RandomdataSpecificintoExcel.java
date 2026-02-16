package DataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RandomdataSpecificintoExcel {

	public static void main(String[] args) throws Exception {
		
		
FileOutputStream file = new FileOutputStream("C:\\Users\\hi\\eclipse-workspace\\SeleniumPractice\\src\\test\\java\\SeleniumPP\\TestData\\RDfile.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("RDData");
		
		XSSFRow row =sheet.createRow(2);
		XSSFCell cell = row.createCell(4);
		
		cell.setCellValue("Welcome");
		
		

		 workbook.write(file);
		   workbook.close();
			file.close();
			
			System.out.println("New File is created ");

	}

}
