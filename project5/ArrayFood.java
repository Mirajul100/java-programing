package project5;

public class ArrayFood {
    public static void main(String[] args) {
        Food food1 = new Food("Rice ball");
        Food food2 = new Food("Fish");
        Food food3 = new Food("meet");
        Food food[] = { food1, food2, food3 };

        for (int i = 0; i < 3; i++) {
            System.out.println(food[i].name);
        }
    }

}
