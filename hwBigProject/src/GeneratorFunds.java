import java.io.*;

public class GeneratorFunds {

    public static void main(String[] args) throws IOException {

        File forFileFund = new File("files/filefund.txt");
        FileReader fileReaderForFileFund = new FileReader(forFileFund);
        BufferedReader bufferedReaderForFileFund = new BufferedReader(fileReaderForFileFund);

        String string = null;
        while ((string = bufferedReaderForFileFund.readLine()) != null) {
            PensionFund pensionFund = new PensionFund(string);
            System.out.println(pensionFund);
        }
    }
}
