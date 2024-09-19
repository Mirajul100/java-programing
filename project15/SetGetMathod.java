package project15;

import java.util.Scanner;

public class SetGetMathod {
    public static void main(String[] args) {

        // Encapsulation

        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter your name : ");
        name = input.nextLine();
        Person person = new Person();
        person.setName(name);
        person.setAge(20);
        person.serGender("male");
        System.out.println("name is : "+person.getName());
        System.out.println("Age is "+person.getAge());
        System.out.println("Gender is "+person.getGender());

    }
}
