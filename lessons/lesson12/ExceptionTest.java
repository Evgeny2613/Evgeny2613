package lessons.lesson12;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        }
        //catch (MyArithmeticException e) {
          //  System.out.println("Exception" + e.getMessage());
        //}
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws MyArithmeticException {
        if (b == 0)
            throw new MyArithmeticException("Division by zero");
        return a/b;
    }
}
