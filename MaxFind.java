public class MaxFind {

    int num1, num2;

    public static int maxFind(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int f = maxFind(2, 3);
        System.out.println(f);
    }
}