import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GeneratorWorkers {

    public static List<Worker> generateWorkers(){
        File file = new File("files/fileperson.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Worker> workers = new ArrayList<>();
        String str = null;

        while (true){
            try {
                if (!((str = bufferedReader.readLine()) !=null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Worker worker = new Worker(str);
            workers.add(worker);

        }
        return  workers;
    }
}
