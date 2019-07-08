import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class benimDeneme {
	
	FileInputStream fis;
	XSSFWorkbook workbook;
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		 	
	}

	
	
	public  void butunSheetYazdir() throws IOException {
		
		fis=new FileInputStream("demoData.xlsx");
		workbook = new XSSFWorkbook(fis);
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

				
			}
		}
		}
		
	

	public  void butunRowYazdir() throws IOException {
		fis=new FileInputStream("demoData.xlsx");
		workbook = new XSSFWorkbook(fis);
		
	}

	
	
	
}