import java.time.LocalDate;

public class NextDayCalculator {
    public LocalDate getNextDay(LocalDate date) {
        return date.plusDays(1);
    }
}
