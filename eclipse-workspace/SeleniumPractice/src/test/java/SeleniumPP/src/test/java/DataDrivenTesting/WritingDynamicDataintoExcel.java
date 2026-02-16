package DataDrivenTesting;

import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataintoExcel {

	public static void main(String[] args) throws Exception {
		
FileOutputStream file = new FileOutputStream("C:\\Users\\hi\\eclipse-workspace\\SeleniumPractice\\src\\test\\java\\SeleniumPP\\TestData\\Dynamicfile.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Dynamic Data");	
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many rows?");
		int noOfrows = sc.nextInt();

		System.out.println("Enter how many cells?");
		int noOfcells = sc.nextInt();

		for(int r = 0; r <= noOfrows; r++)
		{
		    XSSFRow currentRow = sheet.createRow(r);

		    for(int c = 0; c < noOfcells; c++)
		    {
		        XSSFCell cell = currentRow.createCell(c);
		        cell.setCellValue(sc.next());
		    }
		}
		
		
		
		
		
		 workbook.write(file);
		   workbook.close();
			file.close();
			
			System.out.println("New File is created ");

	}

}
