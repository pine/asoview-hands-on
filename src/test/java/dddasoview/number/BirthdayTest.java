package dddasoview.number;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class BirthdayTest {
    @Test
    public void testGetAge() {
        Birthday birthday = Birthday.of(1992, 6, 13);
        LocalDate current = LocalDate.of(2017, 10, 11);
        Age age = birthday.getAge(current);

        Assert.assertEquals(age.getValue(), 25);
    }
}
