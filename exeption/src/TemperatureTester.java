import java.io.IOException;
import java.util.Scanner;

public class TemperatureTester {

    public void test() throws IOException {
        System.out.println("Введите положительне число");

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if(value <= 0){
            throw new IOException();
        }
    }

}
