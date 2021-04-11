package com.prodon.Commonutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility {
public String getdatafromexcel(String sheetname, int rownum, int colnum) throws Throwable
{
	FileInputStream fis = new FileInputStream(Pathconstants.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet("sheetname");
	  Row r = sh.getRow(rownum);
	  Cell c = r.getCell(colnum);
	  return c.getStringCellValue();
	 
	
}

public void setexceldata(String sheetname, int rownum, int colnum, String data) throws Throwable
{
	FileInputStream fis = new  FileInputStream(Pathconstants.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	Row row = sh.getRow(rownum);
	Cell cell = row.createCell(colnum);
	cell.setCellValue(data);
	FileOutputStream fos = new FileOutputStream(Pathconstants.excelpath);
			wb.write(fos);
	      
			wb.close();
}
public int getrowcount(String sheetname,int rownum) throws Throwable
{
	FileInputStream fis = new FileInputStream(Pathconstants.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	return sh.getLastRowNum();
	
}
}

