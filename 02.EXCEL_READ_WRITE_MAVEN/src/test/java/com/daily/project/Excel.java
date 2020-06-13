package com.daily.project;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{  
	public static String getDataFromExcel(String filepath, String SheetName,int rowIndex,int cellIndex)
	{
		String data=null;
		try
		{
			File f= new File(filepath);
			FileInputStream fis= new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st=wb.getSheet(SheetName);
			Row r =st.getRow(rowIndex);
			Cell c= r.getCell(cellIndex);
			data=c.toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	public static void main(String[] args) {
		for(int i=0;i<=2;i++)
		{
		String ss=Excel.getDataFromExcel("C:\\Users\\Admin\\Desktop\\EXCEl_RW\\EXCEL\\sampleData.xlsx", "Sheet1", i, 0);
		System.out.println(ss);
		}
	}

}  