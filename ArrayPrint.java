import java.util.*;
public class ArrayPrint{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the array size : ");
        n = input.nextInt();
        int array [] = new int [n];
        for (int i=0 ; i<array.length ; i++)
        {
            array[i] = input.nextInt();
        }
        for (int i=0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}