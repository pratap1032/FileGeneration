package com.excel;

import  java.io.*;  
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import  org.apache.poi.hssf.usermodel.HSSFRow; 

public class CreateExcel{
	public static void main(String[]args){
		try{
			String filename="hello.xls" ;
			HSSFWorkbook hwb= new HSSFWorkbook();
			HSSFSheet sheet =  hwb.createSheet("Info sheet");

			HSSFRow rowhead=   sheet.createRow((short)0);
			rowhead.createCell(0).setCellValue("SNo");
			rowhead.createCell(1).setCellValue("First Name");
			rowhead.createCell(2).setCellValue("Last Name");
			rowhead.createCell(3).setCellValue("Username");
			rowhead.createCell(4).setCellValue("E-mail");
			rowhead.createCell(5).setCellValue("Country");

			HSSFRow row=   sheet.createRow((short)1);
			row.createCell(0).setCellValue("1");
			row.createCell(1).setCellValue("Pratap");
			row.createCell(2).setCellValue("Raj");
			row.createCell(3).setCellValue("pratap1032");
			row.createCell(4).setCellValue("pratap1032@gmail.com");
			row.createCell(5).setCellValue("India");

			FileOutputStream fileOut =  new FileOutputStream(filename);
			hwb.write(fileOut);
			fileOut.close();
			System.out.println("Your excel file has been generated!");

		} catch ( Exception ex ) {
			System.out.println(ex);

		}
	}
}