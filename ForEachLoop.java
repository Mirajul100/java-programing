import java.util.*;
public class ForEachLoop {
    public static void main(String[] args) {
        ArrayList <String> name  = new ArrayList<>();
        name.add("Anik");
        name.add("Hanif");
        name.add("Habiba");
        name.add("Lizu");
        for (String i : name)
        {
            System.out.println("name is : "+i);
        }
    }
}
