package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements FrameWorkConstants {
	public static Object[][] getMultipleData(String sheetName) throws Exception

	{
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook wk = WorkbookFactory.create(fis);
		Sheet sheet = wk.getSheet(sheetName);
		int rowNo = sheet.getPhysicalNumberOfRows();
		int columnNo = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rowNo - 1][columnNo];
		for (int i = 1, temp = 0; i < rowNo; i++, temp++) {
			int temp1 = 0;
			for (int j = 0; j < columnNo; j++) {
				try {
					data[temp][temp1++] = sheet.getRow(i).getCell(j).toString();
				} catch (Exception e) {
					continue;
				}
			}
		}
		return data;

	}
}
