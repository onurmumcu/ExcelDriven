import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class benimDeneme {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C://Users//Onur//Downloads//demoData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheetNum = workbook.getNumberOfSheets();
		
		for(int i =0; i<sheetNum; i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("data1")) {
		
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> Rows = sheet.iterator();
				
				
			}
			
		
			
			}
		
		
	}

}
