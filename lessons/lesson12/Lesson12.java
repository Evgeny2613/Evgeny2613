package lessons.lesson12;

import java.util.*;

public class Lesson12 {
    public static void main(String[] args) {
        System.out.println(reverseCalculator("2 2 * 1 - 4 * 12 +"));
    }

    public static int reverseCalculator(String w) {
        Queue<String> op = new LinkedList<>(Arrays.asList(w.split(" ")));

        int op1 = 0;
        int op2 = 0;
        String oper;

        if (op.size() > 0) {
            op1 = Integer.parseInt(op.poll());
            while (op.size() >= 2) {
                int res = 0;
                op2 = Integer.parseInt(op.poll());
                oper = op.poll();
                switch (oper) {
                    case "+" -> res = op1 + op2;
                    case "-" -> res = op1 - op2;
                    case "*" -> res = op1 * op2;
                    case "/" -> res = op1 / op2;
                }
                System.out.printf("%d %s %d = %d \n", op1, oper, op2, res);
                op1 = res;
            }
        }

        return op1;
    }

    public static int getMinLength(int[] nums, int k) {
        int currentMinK = 0;
        Deque<Integer> d = new ArrayDeque<>();
        int currentSum = 0;
        for (int element : nums) {
            d.addFirst(element);
            currentSum += element;
            if (currentSum < k)
                continue;
            if (currentSum > k) {
                if (currentMinK == 0)
                    currentMinK = d.size();
                while (currentSum - d.getLast() > k)
                    currentSum -= d.removeLast();
                if (currentMinK > d.size())
                    currentMinK = d.size();
            }

        }
        return currentMinK;
    }

    public static boolean checkBrackets(String w) {
        Stack<Character> chars = new Stack<>();
        for (char c : w.toCharArray()) {
            if (c == '[' || c == '(' || c == '{')
                chars.push(c);
            else if ((c == '}' && chars.peek() == '{')|| (c == ']' && chars.peek() == '[') || (c == ')' && chars.peek() == '('))
                chars.pop();
        }
        return chars.size() == 0;
    }

    private static boolean checkPalindrome(String w) {
        Deque<String> list = new ArrayDeque<>(List.of(w.split("")));
        while (list.size() > 1) {
            String f = list.removeFirst();
            String l = list.removeLast();
            if (!f.equals(l))
                return false;
        }
        return true;
    }
}
