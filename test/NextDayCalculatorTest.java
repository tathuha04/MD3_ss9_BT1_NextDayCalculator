//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {
    private NextDayCalculator nextDayCalculator = new NextDayCalculator();
    @Test
    @DisplayName("Test ngày tiếp theo của ngày 1/1/2018")
    public void testGetNextDay01012018() {
        LocalDate date = LocalDate.of(2018, 1, 1);
        LocalDate nextDay = nextDayCalculator.getNextDay(date);
        LocalDate expectedNextDay = LocalDate.of(2018, 1, 2);
        assertEquals(expectedNextDay, nextDay);
    }
    @Test
    @DisplayName("Test ngày tiếp theo của ngày 31/1/2018")
    public void testGetNextDay31012018() {
        LocalDate date = LocalDate.of(2018, 1, 31);
        LocalDate nextDay = nextDayCalculator.getNextDay(date);
        LocalDate expectedNextDay = LocalDate.of(2018, 1, 22);
        assertEquals(expectedNextDay, nextDay);//Test sai so với kết quả thực
    }
    @Test
    @DisplayName("Test ngày tiếp theo của ngày 30/1/2018")
    public void testGetNextDay30012018() {
        LocalDate date = LocalDate.of(2018, 1, 1);
        LocalDate nextDay = nextDayCalculator.getNextDay(date);
        LocalDate expectedNextDay = LocalDate.of(2018, 1, 2);
        assertEquals(expectedNextDay, nextDay);
    }
    @Test
    @DisplayName("Test ngày tiếp theo của ngày 28/2/2018")
    public void testGetNextDay28022018() {
        LocalDate date = LocalDate.of(2018, 2, 28);
        LocalDate nextDay = nextDayCalculator.getNextDay(date);
        LocalDate expectedNextDay = LocalDate.of(2018, 3, 1);
        assertEquals(expectedNextDay, nextDay);
    }
    @Test
    @DisplayName("Test ngày tiếp theo của ngày 29/2/2020")
    public void testGetNextDay29022020() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        LocalDate nextDay = nextDayCalculator.getNextDay(date);
        LocalDate expectedNextDay = LocalDate.of(2020, 3, 1);
        assertEquals(expectedNextDay, nextDay);
    }
    @Test
    @DisplayName("Test ngày tiếp theo của ngày 31/12/2018")
    public void testGetNextDay31122018() {
        LocalDate date = LocalDate.of(2018, 12, 31);
        LocalDate nextDay = nextDayCalculator.getNextDay(date);
        LocalDate expectedNextDay = LocalDate.of(2019, 1, 1);
        assertEquals(expectedNextDay, nextDay);
    }
}