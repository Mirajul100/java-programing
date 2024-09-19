import java.util.Scanner;

public class Delete {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the array size : ");
        size = sc.nextInt();
        int array[] = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        int position;
        System.out.println();
        System.out.print("Enter the position you need to delete : ");
        position = sc.nextInt();
        for (i = position - 1; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        for (i = 0; i < size - 1; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
