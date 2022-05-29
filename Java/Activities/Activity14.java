package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        String filepath = "src/SampleFile.txt";
        File file = new File(filepath);
        boolean fileStatus = file.createNewFile();

        File fileUtil = FileUtils.getFile(filepath);
        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

        File destDir = new File("resources");
        FileUtils.copyFileToDirectory(file, destDir);

        File newFile = FileUtils.getFile(destDir, "SampleFile.txt");
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
    }
}
