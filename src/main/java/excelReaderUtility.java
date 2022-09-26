import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReaderUtility {
   public static XSSFWorkbook workbook;
	public excelReaderUtility(String filePath) throws FileNotFoundException
	{
		File f=new File(filePath);
		
		FileInputStream fis=new FileInputStream(f);
		
		try {
			workbook=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getDataFromExcelsheet(int sheetIndex, int rows,int cells)
	{
		
		return workbook.getSheetAt(sheetIndex).getRow(rows).getCell(cells).getStringCellValue();
		
	}

	public int totalRowsCount(int sheetIndex)
	{
		return workbook.getSheetAt(sheetIndex).getLastRowNum();
	}
}
