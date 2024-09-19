package project20;

import java.util.Scanner;

public class Array {
    int n;
    Scanner input = new Scanner(System.in);

    Array(int n) {
        this.n = n;
    }

    void Arrayprint() {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter array %d: ", i + 1);
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array is : " + arr[i]);
        }
    }
}
