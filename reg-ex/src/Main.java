import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String str = "123456, city London, st. baker, 1fdgdgdg";
        String regEx = "[0-9]{6}, city [A-Za-z -]+, st\\. [A-Za-z -]+, [0-9]+";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);

        //System.out.println(matcher.matches()); // валидация
        System.out.println(matcher.find()); //поиск информации по строке
        System.out.println(matcher.group());
    }
}