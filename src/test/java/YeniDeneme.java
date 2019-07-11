import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class YeniDeneme {
	public static void main(String[] args) throws IOException {
		
	
	String filePath = "demoData.xlsx";
	FileInputStream fis = new FileInputStream(filePath);

	Workbook workbook = WorkbookFactory.create(fis);
	Sheet worksheet = workbook.getSheetAt(0);
	Row row = worksheet.getRow(0);
	Cell cell = row.getCell(0);
	
	System.out.println(cell);
	
	int rowsCount= worksheet.getPhysicalNumberOfRows();
	int lastrowNumber= worksheet.getLastRowNum();
	int cellCount = row.getPhysicalNumberOfCells();
	
	System.out.println(cellCount);
	
	
	for(int i = 0; i<rowsCount; i++) {
		row = worksheet.getRow(i);
		cell = row.getCell(0);
		System.out.println(i+" - "+cell);
	}
	
	
	Cell log = worksheet.getRow(1).getCell(1);
	System.out.println(log);
	
	for(int i = 1; i<rowsCount; i++) {
		Row myRow = worksheet.getRow(i);
		
		if(myRow.getCell(1).toString().equals("log1")) {
			System.out.println("cevap "+myRow.getCell(1).toString());
			break;
		}
	}
	
	// EXCEL YAZMA
	
	String testDataPath = "yeni.xlsx";
	
	FileInputStream inStream = new FileInputStream(testDataPath);
	Workbook workbook2 = WorkbookFactory.create(inStream);
	Sheet worksheet2 = workbook2.getSheetAt(0);
	
	Cell job =worksheet2.getRow(2).getCell(2);
	job.setCellValue("onur");
	
	FileOutputStream fos = new FileOutputStream(testDataPath);
	workbook2.write(fos);
	
	fos.close();
	workbook2.close();
	inStream.close();
	
	
	
	
	
	
	
	
	
	
}
}