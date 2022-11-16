package Homework.hw17;

public class CodingTester {
    public static void main(String[] args) {
        System.out.println(encode("aaaaabbbc"));
        System.out.println(decode("5a3b1c"));
    }

    public static String decode(String string) {
        String result = "";
        String digits = "";
        char[] letters = string.toCharArray();

        for (char c : letters) {
            if (Character.isDigit(c))
                digits += c;
            else {
                int numberOfLetters = Integer.parseInt(digits);
                for (int i = 0; i < numberOfLetters; i++) {
                    result += c;

                }
                digits = "";
            }
        }
        return result;
    }

    public static String encode(String string) {
        String result = "";
        char[] letters = string.toCharArray();
        int counter = 0;

        char prev = letters[0];
        char current = letters[0];

        for (char c : letters) {
            current = c;
            if (current != prev) {
                result += counter;
                result += current;
                counter = 1;
            }
            else
                counter++;
            prev = current;
        }
        result += counter;
        result += current;

        return result;
    }
}
