package DataDrivenTest;

import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataManual {

	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\test2.xlsx");
		XSSFWorkbook wrkbk = new XSSFWorkbook();
		XSSFSheet sheet =  wrkbk.createSheet("DataSheet1");
		
		XSSFRow row0 = sheet.createRow(1);
		        row0.createCell(0).setCellValue("ID");
		        row0.createCell(1).setCellValue("Name");
		        row0.createCell(2).setCellValue("Class");
		        row0.createCell(3).setCellValue("Phone");
		
		  XSSFRow row1 = sheet.createRow(2);
		        row1.createCell(0).setCellValue("123");
		        row1.createCell(1).setCellValue("Emran");
		        row1.createCell(2).setCellValue("12");
		        row1.createCell(3).setCellValue("01750372695");
		        
		        wrkbk.write(file);
		        wrkbk.close();
		        file.close();

	}

}
