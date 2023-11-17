import java.io.*;

public class BookReader {

    public static void main(String[] args) throws InterruptedException {

        try {
            File file = new File("book.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            System.out.println("Все ОК");

        } catch (FileNotFoundException e) {
            System.out.println("Не удалось найти файл");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("Какието проблемы при работе с файлом");
            e.printStackTrace();
        }
        finally {
            Thread.sleep(1000);
            System.out.println("Я выполнюсь в любом случае");
        }
    }
}
