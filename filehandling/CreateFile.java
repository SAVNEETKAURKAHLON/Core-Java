package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String args[]) {
        File newFile = new File("testingFile.txt");
        try {
            // check if the file exists before creating
            if (newFile.exists() == false) { 
                // creating a new file
                newFile.createNewFile();
            }

            //get the path of file
            System.out.println("after file " + newFile.getCanonicalPath());

            //writing in file with appending = true
            FileWriter fileWriter = new FileWriter(newFile.getCanonicalPath(), true);
            fileWriter.append("\nA quick brown fox jumps over the lazy dog");
            fileWriter.close();
            //reading from file
            Scanner sc = new Scanner(newFile);
            while (sc.hasNextLine()) {
                System.out.println("Reading " + sc.nextLine());
            }

            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
