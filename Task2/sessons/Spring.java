package Task2.sessons;

import java.time.LocalDate;

public class Spring extends Season {

    public static final Spring INSTANCE = new Spring();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public LocalDate nextDate(LocalDate current) {
        return current.plusWeeks(1);
    }
}
