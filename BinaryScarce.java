import java.util.Scanner;

public class BinaryScarce {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the array size : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        SelectionSort sort = new SelectionSort();
        System.out.print("Enter the number you need to scarce : ");
        int num = input.nextInt();
        int left = 0;
        int count = 1;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == num) {
                System.out.println("Number is : " + array[mid]);
                break;
            } else if (array[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            count++;
        }
        System.out.println("count is : " + count);

    }
}