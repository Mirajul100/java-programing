import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // Random random = new Random();
        // int number = random.nextInt(1000) + 50;
        int number = (int) (Math.random()*1000) + 30;
        System.out.println(number);
    }
}
