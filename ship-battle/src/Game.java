import java.util.Scanner;

public class Game {
    private final MesagePrinter mesagePrinter;
    private final Scanner scanner;
    private static final int SHOTS = 10;
    private int counter;

    public Game(MesagePrinter mesagePrinter, Scanner scanner) {
        this.mesagePrinter = mesagePrinter;
        this.scanner = scanner;
    }

    public void startGame() {
        this.mesagePrinter.printStart();
    }

    public void start(Field field) {
        this.startGame();

        for(int i = 0; i < 10; ++i) {
            this.mesagePrinter.printCoordinates();
            int coordinates = this.scanner.nextInt();
            int row = coordinates / 10;
            int column = coordinates % 10;
            boolean result = field.checkCell(row, column);
            if (result) {
                this.mesagePrinter.printWinMessage();
                ++this.counter;
            } else {
                this.mesagePrinter.printLoseMessage();
            }
        }

        this.gameOver();
    }

    public void gameOver() {
        this.mesagePrinter.printEndGame(this.counter);
    }
}
