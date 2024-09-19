import java.util.Scanner;

public class ModeBinary {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        n = input.nextInt();
        int[] l = bable(n);
        binary(n, l);
    }

    public static int[] bable(int n) {
        Scanner input = new Scanner(System.in);
        int a = n;
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < a - 1; i++) {
            int flag = 0;
            for (int j = 0; j < a - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int k = 0; k < a; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();

        return array;
    }

    public static void binary(int n, int[] l) {
        int num = n;
        int low = 0;
        int hig = num - 1;
        int count = 1;
        System.out.print("Enter the number you need to search : ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        while (low <= hig) {
            int mid = (low + hig) / 2;
            if (l[low] == value) {
                System.out.print(l[low]);
                break;
            } else if (l[hig] == value) {
                System.out.print(l[hig]);
                break;
            } else if (l[mid] == value) {
                System.out.println(l[mid]);
                break;
            } else if (l[mid] < value) {
                low = mid + 1;
                hig--;
            } else if (l[mid] > value) {
                hig = mid - 1;
                low++;
            } else {
                System.out.println("number is not founded ?");
                break;
            }
            count++;
        }
        System.out.println("Time of iteration : " + count);
    }
}
