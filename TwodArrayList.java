import java.util.ArrayList;

public class TwodArrayList {
    public static void main(String [] args)
    {
        ArrayList<ArrayList<String>> all = new ArrayList();

        ArrayList <String> name = new ArrayList<>();
        name.add("Anik");
        name.add("Rahul");
        name.add("Oronna");

        ArrayList <String> food = new ArrayList<>();
        food.add("Apple");
        food.add("Mango");
        food.add("Gackfruat");

        ArrayList <String> drink = new ArrayList<>();
        drink.add("soda");
        drink.add("Chai");
        drink.add("Coffe");

        all.add(name);
        all.add(food);
        all.add(drink);

        System.out.println();
        System.out.print(all.get(0).get(0)+" ");
        System.out.print(all.get(0).get(1)+" ");
        System.out.print(all.get(0).get(2)+" ");
        System.out.println();
        System.out.print(all.get(1).get(0)+" ");
        System.out.print(all.get(1).get(1)+" ");
        System.out.print(all.get(1).get(2)+" ");
        System.out.println();
        System.out.print(all.get(2).get(0)+" ");
        System.out.print(all.get(2).get(1)+" ");
        System.out.print(all.get(2).get(2)+" ");
        System.out.println();
        System.out.println(all+" ");
    

    }
}
