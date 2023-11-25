import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            TemperatureTester temperatureTester = new TemperatureTester();
            temperatureTester.test();
            System.out.println("Кажется датчик в норме");

        }
        catch (IOException exception){
            System.out.println("Кажется датчик поломался");
        }
    }
}