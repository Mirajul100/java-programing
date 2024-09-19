package Project14;

public class Recursion {
    int fact (int number){
        if (number == 1){
            return 1;
        }
        else{
            return number*fact(number-1);
        }
    }

}
