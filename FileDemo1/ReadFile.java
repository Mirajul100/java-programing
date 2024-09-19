package FileDemo1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    static void readfile() {
        int counter = 1;
        File dir = new File("FileDemo1");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        File file = new File(path + "/Student.csv");
        BufferedReader reader = null;
        String line = "";
        do {
            try {
                reader = new BufferedReader(new FileReader(file));
                while ((line = reader.readLine()) != null) {
                    String read[] = line.split(",");
                    for (String Information : read) {
                        System.out.printf("%-15s", Information);
                    }
                    System.out.println();
                    counter++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } while (counter == 1);
    }
}
