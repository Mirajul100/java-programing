import java.util.Scanner;

public class Bable {

    public static void size(int a) {
        int array[] = new int[a];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < a - 1; i++) {
            int flag = 0;
            for (int j = 0; j < a - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the array size : ");
        n = scanner.nextInt();
        size(n);
    }
}