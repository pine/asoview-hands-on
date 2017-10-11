package dddasoview.number;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Birthday {
    private final LocalDate value;

    public static Birthday of(int year, int month, int day) {
        return new Birthday(LocalDate.of(year, month, day));
    }

    private Birthday(LocalDate value) {
        this.value = value;
    }

    public Age getAge(LocalDate current) {
        long age = ChronoUnit.YEARS.between(this.value, current);
        return Age.of(age);
    }

    public LocalDate getValue() {
        return value;
    }
}
