package lessons.lesson26;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(mapIntToDouble("15 point expenses is 20 income is 50.3"));

        System.out.println(isGoodPassword("1$abc123444"));
        System.out.println(isGoodPassword("1abc123444"));
        System.out.println(isGoodPassword("1%a!v"));

        System.out.println(extractURLFromLink("<a href='https://www.google.com'>link</a>"));
    }

    public static String extractURLFromLink(String l) {
        if (l.matches(".*href='(.+)'>.*"))
            return l.replaceAll(".*href='(.+)'>.*", "$1");
        return null;
    }

    public static boolean isGoodPassword(String s) {
        if (s.length() <= 8)
            return false;
        if (!s.matches(".*\\d.*"))
            return false;
        if (!s.matches(".*[!@#^&$|].*"))
            return false;
        return true;
    }

    public static String mapIntToDouble(String s) {
        return s.replaceAll("(\\s|^)(\\d+)(\\s)", "$1$2.0$3");
    }
}
