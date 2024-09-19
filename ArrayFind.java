import java.util.Scanner;

public class ArrayFind {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int findArray(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            if (n == arr[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void findIndex(int a) {
        if (a == -1) {
            System.out.println("Not founded");
        } else {
            System.out.println("Founded index is : " + a);
        }
    }

    public static int[] delete(int del, int[] arr) {
        int[] remove = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (del == arr[i]) {
                continue;
            }
            remove[k] = arr[i];
            k++;
        }
        return remove;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the size of Array : ");
        n = input.nextInt();
        int[] arr = new int[n];
        int value;

        for (int i = 0; i < arr.length; i++) {
            value = input.nextInt();
            arr[i] = value;
        }

        print(arr);

        System.out.println("\nEnter the value you need to find index : ");
        value = input.nextInt();
        int f = findArray(value, arr);
        findIndex(f);

        System.out.println("\nEnter the value you need to delete the array : ");
        int dele = input.nextInt();
        int a[] = delete(dele, arr);
        print(a);
    }
}
