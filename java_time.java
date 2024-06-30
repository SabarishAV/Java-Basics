import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class java_time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        System.out.println();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E  K:m:s a");
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate1 = dt.format(dtf1);
        String myDate2 = dt.format(dtf2);
        System.out.println(myDate1);
        System.out.println(myDate2);
    }
}
