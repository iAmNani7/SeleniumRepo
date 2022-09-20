package automationpractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HadlingExcelFiles {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Excel1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String s=wb.getSheet("Data1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(s);
	}
}