package com.dsm.xlsxparser;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class NightSelfLearningSupervisionTableGeneratorApplication {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./test.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheetAt(0);

            int maxRowIndex = sheet.getPhysicalNumberOfRows();
            for(int rowIndex = 0 ; rowIndex < maxRowIndex ; rowIndex++) {
                XSSFRow rows = sheet.getRow(rowIndex);

                int maxColumnIndex = rows.getPhysicalNumberOfCells();
                for(int columnIndex = 0 ; columnIndex < maxColumnIndex ; columnIndex++) {
                    XSSFCell cell = rows.getCell(columnIndex);

                    switch (cell.getCellType()) {
                        case FORMULA:
                            System.out.print(cell.getCellFormula() + "\t\t\t");
                            break;
                        case NUMERIC:
                            System.out.print(String.valueOf((int)cell.getNumericCellValue()) + "\t\t\t");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t\t\t");
                            break;
                        case BOOLEAN:
                            System.out.print(String.valueOf(cell.getBooleanCellValue()) + "\t\t\t");
                            break;
                        case ERROR:
                            System.out.print(String.valueOf(cell.getErrorCellValue()) + "\t\t\t");
                            break;
                        case BLANK:
                            System.out.print("*" + "\t\t\t");
                            break;
                    }
                }
                System.out.println();
            }


        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}