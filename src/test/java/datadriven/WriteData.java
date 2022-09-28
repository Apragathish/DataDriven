package datadriven;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class WriteData {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("src/test/java/datadriven/Data_Set.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int noOfRows = sheet.getLastRowNum();

        System.out.println("No. of Records in the Excel Sheeet:" + noOfRows);

        for (int row=1; row <= noOfRows; row++){

            XSSFRow current_row = sheet.getRow(row);

            String username = current_row.getCell(0).getStringCellValue();
            String password = current_row.getCell(1).getStringCellValue();

        }


    }


}
