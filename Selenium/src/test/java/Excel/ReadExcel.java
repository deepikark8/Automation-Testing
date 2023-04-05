package Excel;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	static XSSFWorkbook excelWorkBook;
	 static XSSFSheet excelWorkSheet;
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/rahade/eclipse-workspace/Selenium/Files/SeleniumPractice.xlsx";
		
		FileInputStream excelFile = new FileInputStream(filePath);
		
		
		 
		 
		 excelWorkBook = new XSSFWorkbook(excelFile);
		 excelWorkSheet = excelWorkBook.getSheet("Home"); //---> Sheet name
		 
		 //System.out.println(excelWorkSheet.getRow(2).getCell(0));
		 
		 
		 int totalRows =4;
		 int totalcols = 3;
		 
		 for(int i=1; i<=totalRows;i++) {
			 for(int j=0;j<totalcols;j++) {
				 
				 System.out.print(excelWorkSheet.getRow(i).getCell(j));
				 System.out.print("\t");
			 }
			 System.out.println("\n");
		 }
		
	}
	

}
