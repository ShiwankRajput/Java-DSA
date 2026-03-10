import java.time.*;
import java.time.format.DateTimeFormatter;

public class Rough{

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plusYears(5));
        System.out.println(localDate.plusDays(5).getDayOfMonth());
        System.out.println(localDate.minusYears(10));

    }

}
