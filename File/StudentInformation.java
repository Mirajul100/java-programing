package File;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class StudentInformation {
    static void write() {
        String name;
        int id;
        int counter = 1;
        do {
            try {
                File dir = new File("person");
                dir.mkdir();
                String path = dir.getAbsolutePath();
                File file = new File(path + "/Student.txt");
                file.createNewFile();
                Formatter formatter = new Formatter(path + "/Student.txt");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the Student Number : ");
                int Number = input.nextInt();
                for (int i = 1; i <= Number; i++) {
                    System.out.print("Enter the Student name : ");
                    name = input.next();
                    System.out.print("Enter the ID number : ");
                    id = input.nextInt();
                    formatter.format("%s\n", name);
                    formatter.format("%d\n", id);
                }
                formatter.close();
                counter++;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("IDIOT ENTER RIGHT VALUE !");
            }
        } while (counter == 1);
    }
}
