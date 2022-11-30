package lessons.lesson26;

import java.util.List;

public class Lesson26 {
    public static void main(String[] args) {
        List<Integer> digits = List.of(1, 4, 54, -2, 16);

        System.out.println(join(digits, "|"));
    }

    public static String join(List<Integer> ints, String sep) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < ints.size(); i++) {
            int d = ints.get(i);
            if (i != 0)
                res.append(sep);
            res.append(i);
        }
        return res.toString();
    }
}
