package File;

import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        // StudentInformation student = new StudentInformation();
        // Read read = new Read();
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to Write the file");
        System.out.println("Press 2 to Read the file");
        System.out.println("Press 3 to Exit the program\n");
        while (true) {
            System.out.print("Enter your choice : ");
            number = input.nextInt();
            switch (number) {
                case 1:
                    StudentInformation.write();
                    break;
                case 2:
                    Read.read();
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Not valid number you entered");
                    break;
            }
        }
    }
}
