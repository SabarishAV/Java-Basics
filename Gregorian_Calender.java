import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian_Calender {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[0]);
    }
}
