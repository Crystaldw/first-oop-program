import java.util.Scanner;

public class Game {

    public void start(Field field) {
        MesagePrinter mesagePrinter = new MesagePrinter();
        Scanner scanner = new Scanner(System.in);

        mesagePrinter.printInfo();

        int row = scanner.nextInt();
        System.out.println("Введите второе число:");
        int column = scanner.nextInt();
        boolean result = field.checkCell(row, column);
        if (result) {
            System.out.println("Молодец");
        } else {
            System.out.println("Промах");
        }
    }
}
