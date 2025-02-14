package src.test.java.week6.day2;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public String[][] excelData(String path) throws Exception, Exception {
		// TODO Auto-generated method stub
		File file=new File(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheetAt = wb.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		XSSFRow row = sheetAt.getRow(0);
		short lastCellNum = row.getLastCellNum();
		String[][] data=new String[lastRowNum+1][lastCellNum];
		for(int i=0;i<=lastRowNum;i++)
		{
			row = sheetAt.getRow(i);
			for(int j=0;j<lastCellNum;j++)
			{
			String stringCellValue = row.getCell(j).getStringCellValue();
			System.out.println(stringCellValue);
			data[i][j]=stringCellValue;
			}
		}
		wb.close();
		return data;
	}

}
