import java.util.*;
public class ArrayInsertion{
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        int size , position , value;
        System.out.print("Enter the array size : ");
        size = input.nextInt();
        int array[] = new int [size+1];
        int i;
        for (i=0 ;i<size ;i++)
        {
            array[i] = input.nextInt();
        }
        for (i=0 ; i<size ; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.print("Enter the position you need to insert : ");
        position = input.nextInt();
        System.out.print("Enter the value you need to insert : ");
        value = input.nextInt();
        for (i=size ; i>position-1 ;i--)
        {
            array[i] = array[i-1];
        }
        array[position -1] = value;
        size ++;
        for (i=0 ; i<size ; i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}