package Project14;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        System.out.print("Enter the number you need to find this number factorial : ");
        value = input.nextInt();
        Recursion recursion = new Recursion();
        int result = recursion.fact(value);
        System.out.println("Factorial is : "+result);
    }
}
