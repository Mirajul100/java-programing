import java.util.*;

public class ResturentMenu {
    static void List() {
        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Berger");
        food.add("Pasta");
        food.add("Bif");
        for (String i : food) {
            System.out.println("Fool name is : " + i);
        }
        int value;
        System.out.print("\n\n1 to Pizza\n");
        System.out.print("2 to Berger\n");
        System.out.print("3 to Pasta\n");
        System.out.print("4 to Bif\n");

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number : ");
            value = input.nextInt();
            switch (value) {
                case 1:
                    System.out.println("Pizza price is 200 tk\n");
                    break;
                case 2:
                    System.out.println("Berger price is 100 tk\n");
                    break;
                case 3:
                    System.out.println("Pasta price is 300 tk\n");
                    break;
                case 4:
                    System.out.println("Bif price is 500 tk\n");
                    break;
                default:
                    System.out.println("You Entered Worng value\n");
                    break;
            }
            break;
        }

    }

    static void soda() {
        ArrayList<String> sode = new ArrayList<>();
        sode.add("Colla");
        sode.add("Coffe");
        sode.add("7 up");
        sode.add("Papce");
        for (String x : sode) {
            System.out.println("Drink name is : " + x);
        }
        int value;
        System.out.print("\n\n1 to Colla\n");
        System.out.print("2 to Coffe\n");
        System.out.print("3 to 7 up\n");
        System.out.print("4 to Pepce\n");

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number : ");
            value = input.nextInt();
            switch (value) {
                case 1:
                    System.out.println("Colla price is 50 tk\n");
                    break;
                case 2:
                    System.out.println("Coffe price is 100 tk\n");
                    break;
                case 3:
                    System.out.println("7 up price is 40 tk\n");
                    break;
                case 4:
                    System.out.println("Pepce price is 30 tk\n");
                    break;
                default:
                    System.out.println("You Entered Worng value\n");
                    break;
            }
            break;
        }
    }

    static void beriane() {
        ArrayList<String> po = new ArrayList<>();
        po.add("Kacci berani");
        po.add("Morog polaoo");
        po.add("Teheri");
        po.add("Polaoo");
        for (String y : po) {
            System.out.println("Berani name is : " + y);
        }

        int value;
        System.out.print("\n\n1 to Kacci berani\n");
        System.out.print("2 to Morog polaoo\n");
        System.out.print("3 to Teheri\n");
        System.out.print("4 to Polaoo\n");

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number : ");
            value = input.nextInt();
            switch (value) {
                case 1:
                    System.out.println("Kacci berani price is 150 tk\n");
                    break;
                case 2:
                    System.out.println("Morog polaoo price is 100 tk\n");
                    break;
                case 3:
                    System.out.println("Teheri price is 200 tk\n");
                    break;
                case 4:
                    System.out.println("Polaoo price is 50 tk\n");
                    break;
                default:
                    System.out.println("You Entered Worng value\n");
                    break;
            }
            break;
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n************ RESTURENT MENU ************");
        while (true) {
            System.out.print("\n\n*****************************");
            System.out.print("\n1 to Food \n");
            System.out.print("2 to Drink \n");
            System.out.print("3 to Beriane\n");
            System.out.print("4 to Exit\n");
            System.out.print("\nEnter the number : ");
            number = input.nextInt();
            switch (number) {
                case 1:
                    List();
                    break;
                case 2:
                    soda();
                    break;
                case 3:
                    beriane();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("you Entered Wrong number\n");
                    break;
            }
        }

    }
}
