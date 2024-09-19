import java.util.*;

public class TwodArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int raw , col ;
        System.out.print("Enter the raw size : ");
        raw = input.nextInt();
        System.out.print("Enter the colunm value : ");
        col = input.nextInt();
        int array[][] = new int[raw][col];
        for (int i=0 ; i<raw ; i++)
        {
            for (int j = 0 ; j<col ; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        for (int i=0 ; i<raw ; i++)
        {
            for (int j= 0 ;j<col; j++)
            {
                System.out.print (array[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
