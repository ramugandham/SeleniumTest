package com.selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File->Workbook--->Sheets--->Rows---Cells
public class WritingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("DynamicData");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows?");
		int no0frows = sc.nextInt();
		System.out.println("Enter how many cells?");
		int no0fcells = sc.nextInt();
		for (int r = 0; r <= no0frows; r++) {
			XSSFRow currentRow = sheet.createRow(r);
			for (int c = 0; c < no0fcells; c++) {
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
				workbook.write(file);
				workbook.close();
				file.close();
				System.out.println("File is creataed");

			
		
	}
}
