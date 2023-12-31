import java.io.*;
import java.util.List;
import java.util.Random;

public class GenFileFunds {

    public static void main(String[] args) throws IOException {

        Random random = new Random();

        File forCity = new File("files/cities.txt");
        File forFund = new File("files/fund.txt");
        File fileFund = new File("files/filefund.txt");

        FileReader fileReaderForCity = new FileReader(forCity);
        FileReader fileReaderForFund = new FileReader(forFund);
        FileWriter fileWriter = new FileWriter(fileFund);

        BufferedReader bufferedReaderForCity = new BufferedReader(fileReaderForCity);
        BufferedReader bufferedReaderForFund = new BufferedReader(fileReaderForFund);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        List<String> cities = bufferedReaderForCity.lines().toList();
        List<String> funds = bufferedReaderForFund.lines().toList();

        System.out.println(cities);
        System.out.println("______________________________");
        System.out.println(funds);

        for (int i = 0; i < 100; i++) {
            boolean state = random.nextBoolean();
            int dataCreation = random.nextInt(1945, 2023);
            int data = dataCreation;

            String states;
            if (state) {
                states = "true";
            } else {
                states = "false";
            }


            int cityRandomNumber = random.nextInt(0, cities.size());
            String city = cities.get(cityRandomNumber);

            int fundRandomNumber = random.nextInt(0, funds.size());
            String fund = funds.get(fundRandomNumber);


            //System.out.println("Пенсионный фонд " + fund + " " + city + " " + data + " " + states);

            String generateString = "Пенсионный фонд: " + fund+ " " + city + " " + data + " " + states;
            bufferedWriter.write(generateString);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }

    }

}

