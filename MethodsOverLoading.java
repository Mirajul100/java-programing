public class MethodsOverLoading {

    public int maxFind(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

    public int maxFind(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        }

        else {
            max = c;
        }

        return max;
    }

    public double maxFind(double a, double b) {
        double max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

    public static void main(String[] args) {

        MethodsOverLoading ml = new MethodsOverLoading();
        int max = ml.maxFind(2, 3);
        int max1 = ml.maxFind(4, 5, 6);
        double max2 = ml.maxFind(4.22, 4.23);

        System.out.println(max);
        System.out.println(max1);
        System.out.println(max2);

    }

}
