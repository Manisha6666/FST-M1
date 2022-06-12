package activities;

import net.bytebuddy.asm.Advice;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.soap.SOAPPart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity13_2a {
    public static void main(String[] args)
    {
        String filePath = "src/test/resources/sample.xlsx";
        Activity13_2a activity = new Activity13_2a();
        activity.writeExcel(filePath);
        activity.readExcel(filePath);
    }
    public void writeExcel(String filePath)
    {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Sheet1");
        List<String[]> data = new ArrayList<String[]>();
        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
        String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
        String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
        String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};

        data.add(heading);
        data.add(row1);
        data.add(row2);
        data.add(row3);

        int rowNum = 0;
        for(String[] rowData : data)
        {
            Row row = sheet.createRow(rowNum++);
            int cellNum = 0;
            for(String cellData : rowData)
            {
                Cell cell = row.createCell(cellNum++);
                cell.setCellValue(cellData);
            }
        }
        try
        {
            FileOutputStream output = new FileOutputStream(filePath);
            wb.write(output);
            wb.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void readExcel(String filePath)
    {
        try
        {
            FileInputStream file = new FileInputStream(filePath);
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            Iterator<Row> rowItr = sheet.iterator();
            while(rowItr.hasNext())
            {
                Row row = rowItr.next();
                Iterator<Cell> cellItr = row.cellIterator();
                while(cellItr.hasNext())
                {
                    Cell cell = cellItr.next();
                    switch (cell.getCellType()){
                        case NUMERIC:
                            System.out.println(cell.getNumericCellValue() + "\t");
                            break;
                        case STRING:
                            System.out.println(cell.getStringCellValue() + "\t");
                            break;
                        default:
                            System.out.println("Invalid Value");
                            break;
                    }
                }
                file.close();
                wb.close();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
