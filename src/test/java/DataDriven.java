import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("demoData.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		
		int sheets = workbook.getNumberOfSheets();
		
		for(int i=0; i<sheets; i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")){
			XSSFSheet sheet = workbook.getSheetAt(i); 
			Iterator<Row> rows =  sheet.iterator();
			
			Row firstRow = rows.next();
			//Row secondRow = rows.next();
			//Row thirdRow = rows.next();
			
			Iterator<Cell> ce =  firstRow.cellIterator();
			
			while(ce.hasNext()) {
			Cell value=ce.next();
			
			//System.out.println(value);
			
			if(value.getStringCellValue().equalsIgnoreCase("TestCases")) {
				
				//desired column
				
				System.out.println(value);
			}	
			}
			}
		}
	}
}
