package activities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Activity13_1 {
    public static void main(String[] args) throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("src/test/resources/sample.csv"));
        var fileData = reader.readAll();
        var fileSz = fileData.size();
        System.out.println("File Size is: "+fileSz);
        Iterator<String[]> itr = fileData.iterator();
        while(itr.hasNext())
        {
            String[] str = itr.next();
            for(int i=0;i<str.length;i++) {
                System.out.print(" " + str[i]);
            }
            System.out.println("");
        }
        reader.close();
    }
}
