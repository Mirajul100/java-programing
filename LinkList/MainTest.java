package LinkList;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ListNode node = new ListNode();
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            System.out.println("\nCreate node to press 1  ");
            System.out.println("print node to press 2  ");
            System.out.println("press 3 to insert last  ");
            System.out.println("node insert any position than press 4  ");
            System.out.println("Deleted node than press 5  ");
            System.out.println("exit to press 6  ");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    node.InsertFirstLinkList();
                    break;
                case 2:
                    node.PrintLinkList();
                    break;
                case 3:
                    node.InsertLast();
                    break;
                case 4:
                    node.InsertAnyPosition();
                    break;
                case 5:
                    System.out.println("Deleted data is " + node.DeleteFirst().getData());
                    break;
                case 6:
                    System.exit(a);
                    break;
                default:
                    System.out.println("You entered invalid value !");
                    break;
            }
        }
    }
}
