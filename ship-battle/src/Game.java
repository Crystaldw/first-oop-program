import java.util.Scanner;

public class Game {
    private final MesagePrinter mesagePrinter;
    private final Scanner scanner;
    private final static int SHOTS = 10;
    private int counter;

    public Game(MesagePrinter mesagePrinter, Scanner scanner) {
        this.mesagePrinter = mesagePrinter;
        this.scanner = scanner;
    }

    public void startGame() {
        mesagePrinter.printStart();
    }

    public void start(Field field) {
        startGame();
        for (int i = 0; i < SHOTS; i++) {
            mesagePrinter.printCoordinates();
            int coordinates = scanner.nextInt();
            int row = coordinates / 10;
            int column = coordinates % 10;

            boolean result = field.checkCell(row, column);

            if (result) {
                mesagePrinter.printWinMessage();
                counter++;
            } else {
                mesagePrinter.printLoseMessage();
            }
        }
        gameOver();
    }

    public void gameOver() {
        mesagePrinter.printEndGame(counter);

    }
}
