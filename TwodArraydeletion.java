import java.util.*;

public class TwodArraydeletion {
    public static void main (String [] args){
        Scanner input  = new Scanner (System.in);
        int raw , col ;
        System.out.print("Enter the array raw size : ");
        raw = input.nextInt();
        System.out.print("Enter the array colunm size : ");
        col = input.nextInt();
        int array[][] = new int [raw][col];
        int i , j ;
        for (i=0 ; i<raw ; i++)
        {
            for (j=0 ; j<col ; j++)
            {
                array[i][j] = input.nextInt();
            }
            
        }

        for (i=0 ; i<raw ; i++)
            {
                for (j=0 ; j<col ; j++)
                {
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }


            int rpo , cpo  ;
            System.out.print("Enter the position you need to delete 2D array raw : ");
            rpo = input.nextInt();
            System.out.print("Enter the position you need to delete 2D array colunm : ");
            cpo = input.nextInt();

            for (i=rpo-1 ; i<raw-1 ; i++)
            {
                for (j=0 ; j<col ; j++)
                {
                    array[i][j] = array[i+1][j];
                }
            }

            for (i=0 ; i<raw ; i++)
            {
                for (j=cpo-1 ; j<col-1 ; j++)
                {
                    array[i][j] = array[i][j+1];
                }
            }

         for (i=0 ; i<raw-1 ; i++)
        {
            for (j=0 ; j<col-1 ; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
            
        }

    }
}
