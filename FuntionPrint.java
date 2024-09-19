import java.util.Scanner;

public class FuntionPrint {

    public static void print (int a)
    {
        
        System.out.println(a);
        return ;
    }
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer value : ");
        a = input.nextInt();
        print(a);
    }
}
