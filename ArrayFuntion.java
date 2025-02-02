import java.util.*;

public class ArrayFuntion {
    public static void arrayprint(int a) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.printf("Array number %d: ", i + 1);

            array[i] = input.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.print(array[i] + " ");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Enter the array number size : ");
        a = input.nextInt();
        arrayprint(a);

    }
}
