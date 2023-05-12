import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class resddatapoi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wBook = new XSSFWorkbook("./Utilities/data.xlsx");
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for (int i=1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0;j<colcount;j++) {
				XSSFCell cell = row.getCell(j);
				String cellvalue = cell.getStringCellValue();
				System.out.println("Cell value for "+i+" row and "+j+" column is: "+cellvalue);
			}
		}
		wBook.close(); 
	}
	}


