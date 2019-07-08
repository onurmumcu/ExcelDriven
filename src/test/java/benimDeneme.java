import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class benimDeneme {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("demoData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheetNum = workbook.getNumberOfSheets();
		
		for(int i =0; i<sheetNum; i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
		
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				
	while(rows.hasNext()) {		
				
				Row row = rows.next();
								
				Iterator<Cell> rowCells = row.cellIterator();
				

				
				
				while(rowCells.hasNext()) {
				Cell cell = rowCells.next();
				System.out.print(cell+" | ");
				}
				
				System.out.println();
	}	
//				Row secondRow = rows.next();
//				
//				Iterator<Cell> secondRowCells = secondRow.cellIterator();
//				
//
//				
//				
//				while(secondRowCells.hasNext()) {
//				Cell secondCell = secondRowCells.next();
//				
//				System.out.print(secondCell+" | ");
//				}
//				
				
				
				
				
//				Cell secondCell = cells.next();
//				System.out.print(secondCell+" | ");
				
//				if(firstCell.getStringCellValue().equalsIgnoreCase("data1")) {
//					System.out.println(firstCell);
//				}
					
				
				
				
			}
			
		
			
			}
		
		
	}

}
