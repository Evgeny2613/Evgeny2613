package lessons;

import lessons.lesson30.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main thread is: " + Thread.currentThread().getId());

//        Thread t1 = new Thread() {
//            @Override
//            public void run() {
//                work();
//            }
//        };
//        t1.start();
//
          MyRunnable r1 = new MyRunnable();
//        new Thread(r1).start();
//        new Thread(r1).start();
//        new Thread(r1).start();
//
//        IntStream.range(0, 10).forEach(i -> {
//                    Thread t = new Thread() {
//                        @Override
//                        public void run() {
//                            work();
//                        }
//
//                    };
//                    t.start();
//                }
//        );

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);

        executorService.shutdown();

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    public static void work() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("new thread is: " + Thread.currentThread().getId());
    }
}
