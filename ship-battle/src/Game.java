import java.util.Scanner;

public class Game {
    private MesagePrinter mesagePrinter;
    private Scanner scanner;
    private final static int SHOTS_FIRED = 2;

    private int counter = 0;

    public Game(MesagePrinter mesagePrinter, Scanner scanner) {
        this.mesagePrinter = mesagePrinter;
        this.scanner = scanner;
    }

    public Game() {

    }

    public void start(Field field) {

        for (int i = 0; i < SHOTS_FIRED; i++) {

            mesagePrinter.printInfo();
            int row = scanner.nextInt();
            mesagePrinter.printSecondNumber();
            int column = scanner.nextInt();

            boolean result = field.checkCell(row, column);
            if (result) {
                System.out.println("Молодец");
            } else {
                System.out.println("Промах");
            }
        }
    }
}
