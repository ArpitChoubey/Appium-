package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\hi\\eclipse-workspace\\SeleniumPractice\\src\\test\\java\\SeleniumPP\\TestData\\Text Data Excel.xlsx");
		
		// System.getProperty("user.dir") + "\\testdata\\data.xlsx"

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");   // XSSFSheet sheet = workbook.getSheetAt(0);

		int totalRows = sheet.getLastRowNum();

		int totalCells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("number of rows:" + totalRows);   //5
		System.out.println("number of cells:" + totalCells); //4

		for(int r = 0; r <= totalRows; r++)
		{
		    XSSFRow currentRow = sheet.getRow(r);

		    for(int c = 0; c < totalCells; c++)
		    {
		        XSSFCell cell = currentRow.getCell(c);
		        System.out.println(cell.toString()+"\t");
		    }
		}
		
		workbook.close();
		file.close();
		
	}

}
