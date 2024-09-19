import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the array size : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int array[] = new int[n];
        for (int m = 0; m < n; m++) {
            array[m] = input.nextInt();
        }
        int min, temp, i;
        for (i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        for (int k = 0; k < n; k++) {
            System.out.println("sorted number is : " + array[k]);
        }
    }
}
