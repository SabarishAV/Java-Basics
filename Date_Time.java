import java.util.Date;

public class Date_Time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());// returns milliseconds passed from January 1 1970
        System.out.println(System.currentTimeMillis()/1000); // seconds
        System.out.println(System.currentTimeMillis()/1000/60); // minutes
        System.out.println(System.currentTimeMillis()/1000/60/60); // hours
        System.out.println(System.currentTimeMillis()/1000/60/60/24); // days
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365); // years

        System.out.println();

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());// in milliseconds
    }
}
