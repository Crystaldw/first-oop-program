import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Date date = new Date(1979, Calendar.OCTOBER, 3);
        Date dateSecond = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2112,12,21);
        LocalDate localDate2 = LocalDate.ofEpochDay(1);
        LocalDate localDate3 = LocalDate.ofYearDay(2012,123);
        LocalDate localDate4 = LocalDate.parse("1998-01-01");
        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);

        System.out.println(localDate4.isLeapYear());
        System.out.println(localDate4.getDayOfWeek());

        localDate4 = localDate4.plusWeeks(2);
        System.out.println(localDate4);
        localDate4 = localDate4.minusYears(2);
        System.out.println(localDate4);

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(2,3,1,4);
        LocalTime localTime2 = LocalTime.ofSecondOfDay(12324);
        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2013,2,3,4,2,1);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);

        localDateTime1 = localDateTime1.withYear(2023);


        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();


        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

    }
}