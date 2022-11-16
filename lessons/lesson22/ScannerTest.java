package lessons.lesson22;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = 0;
        double salary = 0;
        String name = "";
        if (keyboard.hasNextInt())
            age = keyboard.nextInt();

        System.out.println("Enter your salary: ");
        if (keyboard.hasNextDouble())
            salary = keyboard.nextDouble();

        System.out.println("Enter your name: ");
        keyboard.nextLine();
        name = keyboard.nextLine();

        System.out.println("Your name is " + name + " age is " + age + " salary is " + salary);
    }
}
