import java.util.Scanner;

public class MesagePrinter {

    public void printStart() {
        System.out.println("Game START");
        System.out.println("________________");
    }

    public void printCoordinates() {
        System.out.println("Введите координаты цели в формате 00 - 99");
    }

    public void printWinMessage() {
        System.out.println("Молодец");
    }

    public void printLoseMessage() {
        System.out.println("Промах");
    }

    public void printEndGame(int counter) {
        System.out.println("Вы удачно поразили " + counter + " целей");
    }
}
