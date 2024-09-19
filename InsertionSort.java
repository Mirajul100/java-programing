import java.util.Scanner;

public class InsertionSort {

    public static void InsertionSort(int n, int array[]) {
        Scanner input = new Scanner(System.in);
        int temp;
        int j;
        for (int i = 1; i < n; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                }
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the array size : ");
        n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        InsertionSort(n, array);
        for (int i : array) {
            System.out.println("Sorted array is : " + i);
        }
    }
}
