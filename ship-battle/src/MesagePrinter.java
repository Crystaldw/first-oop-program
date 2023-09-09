import java.util.Scanner;

public class MesagePrinter {

    public void printInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game START");
        System.out.println("________________");
        System.out.println("Введите число:");
    }
    public void printSecondNumber(){
        System.out.println("Введите второе число:");
    }
    public void printWinMessage(){
        System.out.println("Молодец");
    }
    public void printLoseMessage(){
        System.out.println("Промах");
    }
}
