import java.io.*;
import java.util.List;
import java.util.Random;

public class Generator {

    public static void main(String[] args) throws IOException {
        Random random = new Random();

        File fileForNames = new File("name.txt");
        File fileForLastNames = new File("lastname.txt");
        File file = new File("file.txt");

        FileReader fileReaderForNames = new FileReader(fileForNames);
        FileReader fileReaderForLastNames = new FileReader(fileForLastNames);
        FileWriter fileWriter = new FileWriter(file);

        BufferedReader bufferedReaderForNames = new BufferedReader(fileReaderForNames);
        BufferedReader bufferedReaderForLastNames = new BufferedReader(fileReaderForLastNames);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        List<String> names = bufferedReaderForNames.lines()
                .toList();
        List<String> lastNames = bufferedReaderForLastNames.lines()
                .toList();

        System.out.println(names);
        System.out.println("------------");
        System.out.println(lastNames);

        for (int i = 0; i < 100000; i++) {
            boolean gender = random.nextBoolean();

            if (gender) {
                System.out.println("женский");
            }
            else {
                System.out.println("Мужской");
            }

            int age = random.nextInt(0, 80);

            int nameRandomNumber = random.nextInt(0, names.size());
            String name = names.get(nameRandomNumber);

            int lastNameRandomNumber = random.nextInt(0, lastNames.size());
            String lastName = lastNames.get(lastNameRandomNumber);

            String generatedString = name + " " + lastName + " " + age;
            bufferedWriter.write(generatedString);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            //bufferedWriter.append(name).append(" ").append(lastName).append(" ").append(String.valueOf(age));
        }



    }
}