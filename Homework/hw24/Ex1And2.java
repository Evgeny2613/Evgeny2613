package Homework.hw24;

//напишите функцию которая проверяет,
// что строка является датой: "24 jan 2001" -> true, "2 FEB 2014" -> true, "12" -> false
//  напишите проверку что это реальная дата "34 JAN 2012" -> false, "29 FEB 1921" -> false

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1And2 {
    public static void main(String[] args) {
        System.out.println(isRealDate("24 jan 2001"));
        System.out.println(isRealDate("29 FEB 2024"));
    }

    public static boolean isRealDate(String s) {
        if (isDate(s)) {
            Pattern pattern = Pattern.compile("(\\d+)\\s+([a-zA-z]+)\\s+(\\d+)");
            Matcher dateMather = pattern.matcher(s);
            while (dateMather.find()) {
                int day = Integer.parseInt(dateMather.group(1));
                String month = dateMather.group(2).toLowerCase();
                int year = Integer.parseInt(dateMather.group(3));


                // moths with 31 days
                if (month.equals("jan") | month.equals("mar") | month.equals("may") | month.equals("jul") | month.equals("aug") | month.equals("oct") | month.equals("dec")) {
                    return day > 0 & day <= 31;
                }
                // moths with 30 days
                else if (month.equals("apr") | month.equals("jun") | month.equals("sep") | month.equals("nov"))
                    return day > 0 & day <= 30;

                    // february
                else {
                    if (year % 4 == 0 & year % 100 == 0 & year % 400 == 0)
                        return day > 0 & day <= 29;
                    else if (year % 4 == 0 & year % 100 != 0)
                        return day > 0 & day <= 29;
                    else
                        return day > 0 & day <=28;
                }
            }
        }
        return false;
    }

    public static boolean isDate(String date) {
        return date.matches("\\d+\\s+[a-zA-Z]+\\s+\\d+");
    }
}
