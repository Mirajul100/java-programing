package project20;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        n = input.nextInt();
        Array array = new Array(n);
        array.Arrayprint();
    }
}
