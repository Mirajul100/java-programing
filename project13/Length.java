package project13;

public class Length {
    int number;
    void sum(int ... num)
    {
        int Sum = 0;
        for (int x : num)
        {
             Sum = Sum + x;
        }

        System.out.println(Sum);
        
    }
}
