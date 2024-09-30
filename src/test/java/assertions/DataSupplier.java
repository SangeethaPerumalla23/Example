package assertions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataSupplier {
	
	public static void main(String[] args) throws IOException {
		
		File excel_file = new File("C:\\Users\\Sangeetha\\Desktop\\data.xlsx");
		FileInputStream fis  = new FileInputStream(excel_file);
		try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int Rows_count = sheet.getPhysicalNumberOfRows();
			int Columns_count = sheet.getRow(0).getLastCellNum();
			
			for (int i = 0; i < Rows_count; i++) {
				
				for (int j = 0; j < Columns_count; j++) {
					
					System.out.println(sheet.getRow(i).getCell(j));
				}
				
			}
			workbook.close();
			fis.close();
			
		
	}

	}

}
