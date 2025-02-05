package OOP.arrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WeekDayTest {
    @Test
    public void Måndag(){
        WeekDays weekDays = new WeekDays();
        assertEquals("Måndag",weekDays.dayOfWeek(1));
    }
    public void TestOfArrayList(){
        WeekDays weekDays = new WeekDays();
        assertEquals("Onsdag", weekDays.weekDaysArrayList.get(-1));

    }
}
