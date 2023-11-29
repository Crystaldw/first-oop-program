import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GeneratorFunds {

    public List<PensionFund> generatePensionFund() throws IOException {

        File forFileFund = new File("files/filefund.txt");
        FileReader fileReaderForFileFund = new FileReader(forFileFund);
        BufferedReader bufferedReaderForFileFund = new BufferedReader(fileReaderForFileFund);

        List<PensionFund> pensionFunds = new ArrayList<>();
        String string = null;
        while ((string = bufferedReaderForFileFund.readLine()) != null) {
            PensionFund pensionFund = new PensionFund(string);
            pensionFunds.add(pensionFund);
        }
        return pensionFunds;
    }
}
