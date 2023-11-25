import java.io.*;

public class GeneratorWorkers {
    public static void main(String[] args) throws IOException {
        File file = new File("files/fileperson.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str = null;

        while ((str = bufferedReader.readLine()) !=null){
            Worker worker = new Worker(str);
            System.out.println(worker);
        }
    }
}
