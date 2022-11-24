package lessons.lesson25;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson25 {
    public static void main(String[] args) {
         String string = "this is a max temperature and it was claimed to be a maximum";
        Pattern max = Pattern.compile("max"); // скомпилированное регулярное выражение
        Matcher matcher = max.matcher(string);
        System.out.println(matcher.find());
        System.out.println(matcher.results().count());

        System.out.println("---");
        System.out.println("hello".matches("hel."));
        System.out.println("hello".matches("hel..")); // . - любой символ


        System.out.println("---");
        System.out.println("hello.".matches("hello\\."));

        System.out.println("-|-");
        System.out.println("max".matches("max|dima"));
        System.out.println("pax".matches("max|dima"));

        System.out.println("---");
        System.out.println("a".matches("[abc]"));
        System.out.println("a".matches("[^kmp]"));

        // [d-f1-3] [def123]

        System.out.println("*+");
        System.out.println("max goldin".matches("[a-z]+\\s[a-z]+"));

//        System.out.println("123.123".matches("[0-9]{3}\\.[0-9]{3}"));
        System.out.println("123.123".matches("\\d{3}\\.\\d{3}"));


        System.out.println("123.123.33.1".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));

        System.out.println(isToken("423445"));

        System.out.println(isPhoneNumber("++75961"));

        System.out.println("____EX_____");
        System.out.println(isHexNumber("0x1"));
        System.out.println(isHexNumber("0X1"));
        System.out.println(isHexNumber("0XABC"));
        System.out.println(isHexNumber("0XABW"));
        System.out.println(isHexNumber("1"));


        String line = "to be or not to be";
        Arrays.stream(line.split("\\s+" )).forEach(System.out::println);

        String csv = "michael;golding;33;33_000";
        Arrays.stream(csv.split(";"))
                .forEach(System.out::println);

        String name = "michael svetlov lena shmeleva";

        Pattern firstLastName = Pattern.compile("(\\w+)\\s(\\w+)");
        Matcher nameMatcher = firstLastName.matcher(name);
        while (nameMatcher.find())
            System.out.println(nameMatcher.group(1) + "|" + nameMatcher.group(2));


        String temperature = "Today's emperature is 18 degrees centigrade";
        temperature = temperature.replaceAll("\\d+", "45");
        temperature = temperature.replaceAll("centigrade", "farenheit");
        System.out.println(temperature);


        String s = "one two three twenty eight";
        s = s.replaceAll("(tw\\w+)", "_$1_"); // $1 - ссылка на первую группу
        System.out.println(s);
    }



    public static boolean isHexNumber(String s) {
        return s.matches("0[xX][\\dA-Fa-f]+");
    }
    public static boolean isPhoneNumber(String s) {
        return s.matches("\\+?\\d{1,8}");
    }

    public static boolean isToken(String t) {
        return t.matches("\\d{4}|\\d{6}");
    }

    public static boolean isCarNumber(String n){
        return n.matches("[A-Z]{1,2}\\s\\d{3,4}");
    }
}
