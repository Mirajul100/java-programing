import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public static void main (String[] args){
    Date date = new Date();
    DateFormat dateformate = new SimpleDateFormat("dd/MM/YYYY");
    String CurrentDate = dateformate.format(date);
    System.out.println(CurrentDate);

    }
}