import java.util.Scanner;


public class ArrayReverse {
    public static void main (String args [])
    {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.print("Enter the array size : ");
        n = input.nextInt();
        int arrayre[] = new int [n];
        int i;
        for (i=0 ; i<arrayre.length ; i++)
        {
            arrayre[i] = input.nextInt();
        }


        for (i=0 ; i<arrayre.length ; i++)
        {
            System.out.print(arrayre[i]+" ");
        }
        System.out.println();

        for (i=arrayre.length-1 ; i>=0 ; i--)
        {
            System.out.print(arrayre[i]+" ");
        }
        
    }
    
}
