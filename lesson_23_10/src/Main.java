import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Person person = new Person("Даниил", "Ткаченко", 67);
        Person personFromString = new Person("Даниил Ткаченко 67");

        System.out.println(person);
        System.out.println(personFromString);


        String s = "Hello my name is Daniil";
        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);






        File file = new File("file.txt"); //относительным путем
        //File file = new File("C:/Users/datky/IdeaProjects/javaio/daniil/file.txt"); //абсолютным

        //Scanner scanner = new Scanner(file);
        //
        //while (scanner.hasNextLine()) {
        //    String str = scanner.nextLine();
        //    System.out.println(str);
        //}

//        FileReader fileReader = new FileReader(file);
        //for (int i = 0; i < 20; i++) {
        //    int result = fileReader.read();
        //    System.out.println(result);
        //    char symbol = (char) result;
        //    System.out.println(symbol);
        //}

//        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //String str = bufferedReader.readLine();
        //System.out.println(str);

//        long answer = bufferedReader.lines()
//                .filter(str -> str.startsWith("П"))
//                .count();

//        System.out.println(answer);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println(str);
        }

    }
}