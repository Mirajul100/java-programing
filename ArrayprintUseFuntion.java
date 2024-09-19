import java.util.*;

public class ArrayprintUseFuntion {
    public static void arrayprint (int a[])
    {
        for (int i=0 ; i<a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
        return ;
    }
    public static void main (String args []){
        Scanner input = new Scanner (System.in);
        int n;
        System.out.print("Enter the array size : ");
        n = input.nextInt();
        int array[] = new int [n];
        for (int i=0 ; i<array.length ; i++)
        {
            array[i] = input.nextInt();
        }
        arrayprint(array);

    }
}
