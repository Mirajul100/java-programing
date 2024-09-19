package Project11;

import java.util.Scanner;

public class OverLodingContructor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, Gender;
        int phone;
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your Gender : ");
        Gender = input.nextLine();
        System.out.print("Enter your phone number : ");
        phone = input.nextInt();
        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher(name, Gender);
        teacher1.DisplayInformation();
        Teacher teacher2 = new Teacher(name, Gender, phone);
        teacher2.DisplayInformation();
    }
}
