package lessons.lesson33;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class PiTester {
    private static final AtomicInteger yes = new AtomicInteger(0);

    private static Random random = new Random();

    private static final int number = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(8);

        IntStream.range(0, number)
                .forEach(i -> service.submit(new PiRunnable()));
        service.shutdown();
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
        System.out.println(4.0 * yes.get() / number);
    }



    static class PiRunnable implements Runnable {
        @Override
        public void run() {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double r = Math.sqrt(x * x + y * y);
            if (r <= 1.0)
                yes.incrementAndGet();
        }
    }
}
