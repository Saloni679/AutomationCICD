package datadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("File path");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		int sheet = workbook.getNumberOfSheets();
		for(int i =0; i<sheet; i++)
		{
			workbook.getSheetAt(i);
		}
	
		 
		 // Get the number of rows and columns
       /* int rows = sheet.getNumberOfRows();
        int cols = sheet.getRow(0).getNumberOfCells();

		for(int i =0; i<sheets; i++)
		{
			workbook.getSheet(i);
		}

		*/	
	}

}
