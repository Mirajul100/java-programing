import java.util.*;

public class ArrayReverseFuntion {
    public static int arrayprint (int a)
    {
        Scanner input = new Scanner (System.in);
        int array[] = new int [a];
        for (int i=0 ; i<a ; i++)
        {
            System.out.printf("Array value numbet is %d : ",i+1);
            array[i] = input.nextInt();
        }
        for (int i=0 ; i<a ; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i=a-1 ; i>=0 ; i--)
        {
            System.out.print(array[i]+" ");
        }
        return a ;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a;
        System.out.print("Enter the arraay size : ");
        a = input.nextInt();
        int l = arrayprint(a);

    }
}
