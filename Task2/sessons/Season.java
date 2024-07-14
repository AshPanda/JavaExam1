package Task2.sessons;

import java.time.LocalDate;

public abstract class Season {

    public abstract LocalDate nextDate(LocalDate current);

    public static Season getSeason(LocalDate src) {
        return switch (src.getMonth()) {
            case DECEMBER, JANUARY, FEBRUARY -> Winter.INSTANCE;
            case MARCH, APRIL, MAY -> Spring.INSTANCE;
            case JUNE, JULY, AUGUST -> Summer.INSTANCE;
            case SEPTEMBER, OCTOBER, NOVEMBER -> Autumn.INSTANCE;
        };

    }
}
