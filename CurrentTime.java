import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class CurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String CurrentTime = formatter.format(time);
        System.out.println(CurrentTime);
    }
}
