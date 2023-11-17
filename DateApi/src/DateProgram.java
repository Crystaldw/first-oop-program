import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateProgram {
    public static void main(String[] args) {
        System.out.println("Введите дату в формате dd.mm.yyyy");

        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        //15.11.2023

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

        if(localDate.isBefore(localDate.now())){
            System.out.println("Вы выбрали дату в прошлом");
        }
        else {
            System.out.println("Вы выбрали дату в будущем");
        }
    }
}
