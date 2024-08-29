package selenium_webautomation_Learn;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {
public static void main(String args[]) throws IOException {
	
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Data\\Book1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
//	workbook.getSheetAt(0)
	int Numrow=sheet.getLastRowNum();
	int colNum=sheet.getRow(1).getLastCellNum();
	for(int r=0;r<Numrow;r++) {
		XSSFRow currentRow=sheet.getRow(r);
//		System.out.println(currentRow);
		for(int c=0;c<colNum;c++) {
			
			XSSFCell cell=currentRow.getCell(c);
			System.out.print(cell.toString()+"\t");
			
		}
		System.out.println();
	}
	
	
}
}
