import java.util.Scanner;

public class Fibonacci {

    public static int[] fib(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        int[] array = new int[n]; // this is called initialization

        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            array[i] = num1;

            // Swap
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

        return array;
    }

    public static int search(int x, int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (arr[i] == x) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = input.nextInt();
        int[] arr = fib(size);

        System.out.print("\nEnter the search value : ");
        int value = input.nextInt();
        int n = search(value, arr);

        if (n == -1) {
            System.out.println("Not founded");
        } else {
            System.out.println("Founded index : " + n);
        }
    }
}