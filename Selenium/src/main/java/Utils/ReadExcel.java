package Utils;
import java.io.*;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		// to create a new folder inside the project
		//--right click project->show in->system explorer->create new folder
		String fileLocation = "./test-data/LoginData.xlsx";
		//Locate the work book
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation); // workbook inside the file location
		XSSFSheet sheet  = wbook.getSheetAt(0);// sheets in the excel
		XSSFRow row =  sheet.getRow(1);
		if (row == null) {
		    System.out.println("Row is null. Check if Excel has proper data in row 2.");
		    return;
		}

		for(int i =0; i<2;i++)
				{	XSSFCell col = row.getCell(i);
		//when its in a dynamic it wont return in the string so,
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(col);
						
//		String value = col.getStringCellValue();
//		System.out.println(value);
				}
		System.out.println(sheet.getLastRowNum()); // to get the last row number of the sheet//-- it will reject the header row so, 
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getRow(0).getLastCellNum());
	}
}