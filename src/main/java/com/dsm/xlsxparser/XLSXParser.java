package com.dsm.xlsxparser;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.rmi.activation.ActivationID;
import java.util.ArrayList;
import java.util.List;

public class XLSXParser {

    private static final int SUNDAY = 0;
    private static final int MONDAY = 2;
    private static final int TUESDAY = 4;
    private static final int WEDNESDAY = 6;
    private static final int THURSDAY = 8;
    private static final int FRIDAY = 10;
    private static final int SATURDAY = 12;

    private String path;
    private String fileName;

    public XLSXParser() {}
    public XLSXParser(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
    }

    public List<Activity> parseXLSX(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
        return parseXLSX();
    }

    public List<Activity> parseXLSX() {

        List<Activity> activities = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(path + fileName);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            String year = "2003";
            String month = "08";
            String[] dayOfMonths = new String[14];
            String[][] supervisor = new String[3][14];



            XSSFSheet sheet = workbook.getSheetAt(0);

            int maxRowIndex = sheet.getPhysicalNumberOfRows();
            for(int rowIndex = 0 ; rowIndex < maxRowIndex ; rowIndex++) {

                XSSFRow rows = sheet.getRow(rowIndex);

                int maxColumnIndex = rows.getPhysicalNumberOfCells();
                for(int columnIndex = 0 ; columnIndex < maxColumnIndex ; columnIndex++) {
                    XSSFCell cell = rows.getCell(columnIndex);

                    cell.setCellType(CellType.STRING);
                    String value = cell.getStringCellValue();

                    System.out.print(value);
                }
                System.out.println();
            }


        } catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
