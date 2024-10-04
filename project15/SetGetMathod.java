package project15;

import java.util.Scanner;

public class SetGetMathod {
    public static void main(String[] args) {

        // Encapsulation

        Scanner input = new Scanner(System.in);
        String name, gender;
        int age;
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your gender : ");
        gender = input.nextLine();
        System.out.print("Enter your age : ");
        age = input.nextInt();
        Person person = new Person(name, gender, age);
        System.out.println("name is : " + person.getName());
        System.out.println("Age is " + person.getAge());
        System.out.println("Gender is " + person.getGender());

    }
}
