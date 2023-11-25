import java.io.*;
import java.util.List;
import java.util.Random;

public class GenFilePersons {

    public static void main(String[] args) throws IOException {

        Random random = new Random();

        File fileForNames = new File("files/name.txt");
        File fileLastNames = new File("files/lastname.txt");
        File file = new File("files/fileperson.txt");

        FileReader fileReaderForNames = new FileReader(fileForNames);
        FileReader fileReaderForLastNames = new FileReader(fileLastNames);
        FileWriter fileWriter = new FileWriter(file);

        BufferedReader bufferedReaderForNames = new BufferedReader(fileReaderForNames);
        BufferedReader bufferedReaderForLastNames = new BufferedReader(fileReaderForLastNames);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        List<String> names = bufferedReaderForNames.lines()
                .toList();

        List<String> lastNames = bufferedReaderForLastNames.lines()
                .toList();

        System.out.println(names);
        System.out.println(lastNames);

        for (int i = 0; i < 10000; i++) {
            boolean gender = random.nextBoolean();

            String genders;
            if (gender) {
                genders = "FEMALE";
            } else {
                genders = "MALE";
            }

            int age = random.nextInt(10, 80);

            int nameRandomNumber = random.nextInt(0, names.size());
            String name = names.get(nameRandomNumber);

            int lastNameRandomNumber = random.nextInt(0, lastNames.size());
            String lastName = lastNames.get(lastNameRandomNumber);

            int minSalary = random.nextInt(100, 3000);
            int maxSalary = random.nextInt(3000, 50000);

//            System.out.println(name + " " + lastName + " "  + minSalary + " " + maxSalary + " " + genders);

            String generateString = name + " "+ lastName + " " + minSalary + " " + maxSalary + " " + genders;
            bufferedWriter.write(generateString);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
