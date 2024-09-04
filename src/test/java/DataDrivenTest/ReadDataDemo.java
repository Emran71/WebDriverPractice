package DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataDemo {
public static void main(String[] args) throws IOException {
	
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\test1.xlsx");
	XSSFWorkbook wrkbooks = new XSSFWorkbook(file);
	XSSFSheet sheet = wrkbooks.getSheet("Sheet1");
	
	int total_row = sheet.getLastRowNum();
	int total_col = sheet.getRow(1).getLastCellNum();
	
	for(int row=0;row<=total_row;row++)
	{
		XSSFRow currentRow = sheet.getRow(row);
		 
		for(int col = 0; col<total_col;col++)
		{
			XSSFCell cell = currentRow.getCell(col);
			System.out.print(cell.toString()+"   ");
		}
		System.out.println();
	}
	file.close();
	wrkbooks.close();
}
}
