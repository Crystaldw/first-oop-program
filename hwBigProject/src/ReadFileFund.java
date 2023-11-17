import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ReadFileFund {

    public static void main(String[] args) throws FileNotFoundException {

        File forFileFund = new File("files/filefund.txt");
        FileReader fileReaderForFileFund = new FileReader(forFileFund);
        BufferedReader bufferedReaderForFileFund = new BufferedReader(fileReaderForFileFund);

        List<String> funds = bufferedReaderForFileFund.lines().toList();
        System.out.println(funds);
    }
}
