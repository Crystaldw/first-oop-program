import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatMain {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_ORDINAL_DATE;

        DateTimeFormatter myOwnDateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy ");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.format(dateTimeFormatter));
        System.out.println(localDate.format(myOwnDateTimeFormatter));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(localTime.format(dateTimeFormatter1));

        DateTimeFormatter parseFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate readLocalDate = LocalDate.parse("2023/11/15", parseFormatter);
        System.out.println(readLocalDate.format(parseFormatter));
    }
}
