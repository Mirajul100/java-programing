package File;

import java.io.File;
import java.util.Scanner;

public class Read {
    static void read() {
        int counter = 1;
        do {
            try {
                File dir = new File("person");
                dir.mkdir();
                String path;
                path = dir.getAbsolutePath();
                File file = new File(path + "/Student.txt");
                Scanner in = new Scanner(file);

                while (in.hasNext()) {
                    String name = in.next();
                    int id = in.nextInt();
                    System.out.println("Name is : " + name);
                    System.out.println("ID is   : " + id + "\n");
                }
                in.close();
                counter++;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (counter == 1);
    }
}
