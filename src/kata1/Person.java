package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private static final long MILLISECONDS_PER_YEAR = (long) (60 * 60 * 1000 * 24 * 365.25);
    private final String name;
    private final String surname;
    private final Calendar birthday;

    public Person(String name, String surname, Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getFullName(){
        return name + " " + surname;
    }

    public int getAge(){
        return fromMillisToYears(GregorianCalendar.getInstance().getTimeInMillis()-birthday.getTimeInMillis());
    }

    private int fromMillisToYears(long millis) {
        return (int) (millis/MILLISECONDS_PER_YEAR);
    }
}
