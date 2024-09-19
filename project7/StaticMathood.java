package project7;

public class StaticMathood {
    public static void main(String [] args){
        Friend friend1 = new Friend("Anik");
        Friend friend2 = new Friend("Rahul");
        Friend friend3 = new Friend("Habiba");
        Friend friend4 = new Friend("Arrona");
        
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);
        System.out.println(Friend.numberofFrinend);
    }
}
