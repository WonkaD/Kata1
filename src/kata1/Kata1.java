package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1995,Calendar.MARCH,4);
        Person p1 = new Person("Oscar","Garcia",date);
        System.out.println(p1.getFullName()+"\n"+p1.getAge());
        System.out.println(p1.getBirthday().getTime());
    }

}
