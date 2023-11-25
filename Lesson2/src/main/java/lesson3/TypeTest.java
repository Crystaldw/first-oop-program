package lesson3;

public class TypeTest {

    public static void main(String[] args) {

        byte b = 45;
        short sh;
        sh = b;

        System.out.println(sh);

        sh = 100;
        b = (byte) sh;

        System.out.println(b);

        int i = 100;
        double d = 55.55;
        System.out.println(i+d);
        int i1 = 40;

        System.out.println(i / (double)i1);

        char ch = '9';

        String str = "9";

        int a = ch - '0';
        System.out.println(a);

        int c = Integer.parseInt(String.valueOf(ch));
        System.out.println(c);

        int e = Character.getNumericValue(ch);
        System.out.println(e);

        int f = Integer.parseInt(str);
        System.out.println(f);

        String word = "Hello!";
        word.length();
        System.out.println(word.length());
        System.out.println(word.charAt(4));
        System.out.println(word.substring(2, 3));

        System.out.println(word.contains("l"));
        System.out.println(word.contains("w"));

        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.startsWith("He"));
        System.out.println(word.replace('e', 'u'));



    }
}
