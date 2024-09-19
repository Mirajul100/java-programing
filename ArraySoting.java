import java.util.ArrayList;

public class ArraySoting {
    public static void main (String args []){
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("size of array = "+number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        for (int x : number)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("size of array = "+number.size());
        number.clear();
        System.out.println("after clear array list : "+number);
       boolean cheak = number.isEmpty();
       System.out.println("array list empty : "+cheak);
    }
}
