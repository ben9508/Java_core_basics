import java.util.*;
import java.text.*;

/* public class DateDemo {
    public static void main(String args[]) {
        Date date = new Date();
        System.out.println(date.toString());
    }
} */

public class DateDemo {
    public static void main(String args[]) {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(dNow));
    }
}