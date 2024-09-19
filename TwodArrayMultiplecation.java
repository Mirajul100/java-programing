import java.util.*;


public class TwodArrayMultiplecation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int raw,col,i,j,k,raw1,col1 , n, m , sum = 0;
        int a[][] = new int [10][10];
        int b[][] = new int [10][10];
        int c[][] = new int [10][10];
        System.out.print("Enter first matrix raw size : ");
        raw = input.nextInt();
        System.out.print("Enter second matrix  colunm size : ");
        col = input.nextInt();
        System.out.println("First matrix :");
        for (i=0 ; i<raw ; i++)
        {
            for (j= 0 ; j<col ; j++)
            {
                a[i][j] = input.nextInt();
            }
        }    
        System.out.println("First matrix : ");
        for (i=0 ; i<raw ; i++)
        {
            for (j= 0 ; j<col ; j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }    
        System.out.print("Enter the second matrix raw size : ");
        n = input.nextInt();
        System.out.print("Enter the second matrix colunm size : ");
        m = input.nextInt();
        System.out.println ("Second matrix : ");
         for (i=0 ; i<n ; i++)
        {
            for (j= 0 ; j<m ; j++)
            {
                b[i][j] = input.nextInt();
            }
        }    
        System.out.println("Second matrix : ");

        for (i=0 ; i<n ; i++)
        {
            for (j= 0 ; j<m ; j++)
            {
               System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }    

        if (raw != m)
        {
            System.out.println("Not Multiplecation : ");
        }
        else 
        {
            for (i = 0 ; i<raw ; i++)
            {
                for (j=0 ; j<col ; j++)
                {
                    for (k=0 ; k < n ; k++)
                    {
                        sum = sum + a[i][k] * b[k][j];
                    }
                    c[i][j] = sum ;

                }
            }
        }
        System.out.println("Multiplecation matrix : ");

         for (i=0 ; i<raw ; i++)
        {
            for (j= 0 ; j<m ; j++)
            {
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }    



    }
}
