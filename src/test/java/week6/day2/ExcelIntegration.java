package src.test.java.week6.day2;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegration {
	public static void main(String[] args) throws Exception {
		ExcelIntegration ei=new ExcelIntegration();
		String[][] excelData = ei.excelData();
	}

	public String[][] excelData() throws Exception, Exception {
		// TODO Auto-generated method stub
		File file=new File("./Data/TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheetAt = wb.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		XSSFRow row = sheetAt.getRow(0);
		int lastCellNum = row.getLastCellNum();
		System.out.println(lastRowNum);
		System.out.println(lastCellNum);
		String[][] data=new String[lastRowNum+1][lastCellNum];
		for(int i=0;i<=lastRowNum;i++)
		{
			row = sheetAt.getRow(i);
			lastCellNum = row.getLastCellNum();
			System.out.println(lastCellNum);
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
