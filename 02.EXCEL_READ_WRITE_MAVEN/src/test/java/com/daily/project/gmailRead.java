package com.daily.project;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class gmailRead {
	public static String getDatafromExcel(String filepath,String sheetName,int rowIndex,int colIndex)
	{
		String data=null;
		try
		{
			File f= new File(filepath);
			FileInputStream fis= new FileInputStream(f);
			Workbook wb= WorkbookFactory.create(f);
			Sheet s=wb.getSheet(sheetName);
			Row row= s.getRow(rowIndex);
			Cell cell=row.getCell(colIndex);
			data=cell.toString();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		for(int i=0;i<=1;i++)
		{
			String ss=gmailRead.getDatafromExcel("C:\\Users\\Admin\\Music\\simpledata.xlsx", "Sheet1", i,0);
	         al.add(ss);
		}
		System.out.println(al);
		String s1=(String) al.get(0);
		String s2 =(String) al.get(1);
		System.out.println("username="+s1);
		System.out.println("password="+s2);
		
		
		

	}

}
