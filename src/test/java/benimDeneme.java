import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class benimDeneme {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("demoData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheetNum = workbook.getNumberOfSheets();
		
		for(int i =0; i<sheetNum; i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("data1")) {
		
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				
//		calismiyor		Row secondRow = rows.next();
//		calismiyor		System.out.println(firstRow.toString());				
//		calismiyor		System.out.println(secondRow);
				
				Iterator<Cell> cells = firstRow.cellIterator();
				
				System.out.println(cells);
				
			}
			
		
			
			}
		
		
	}

}
