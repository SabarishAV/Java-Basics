import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Calender_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());

        System.out.println();

        Calendar j = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"));
        DateFormat df = DateFormat.getInstance();
        df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        System.out.println(df.format(j.getTime()));
        System.out.format("%d : %d : %d",j.get(Calendar.HOUR),j.get(Calendar.MINUTE),j.get(Calendar.SECOND));
//        System.out.println(j);
//        System.out.println(j.getCalendarType());
//        System.out.println(j.getTime());
//        System.out.println(j.getTimeZone());
    }
}
