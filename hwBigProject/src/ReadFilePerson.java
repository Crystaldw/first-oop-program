import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFilePerson {

    public static void main(String[] args) throws FileNotFoundException {

        File forFilePerson = new File("files/fileperson.txt");
        FileReader fileReaderForFilePerson = new FileReader(forFilePerson);

        BufferedReader bufferedReaderForFilePerson = new BufferedReader(fileReaderForFilePerson);


        List<Worker> workerList = bufferedReaderForFilePerson.lines()
               .map(str -> new Worker())
               .toList();
        System.out.println(workerList);

    }

}
