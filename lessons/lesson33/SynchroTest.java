package lessons.lesson33;

public class SynchroTest {

    public static int data[] = {0};

    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join(); //дождаться конца работы потока t1
        t2.join(); //дождаться конца работы потока t2
        System.out.println(data[0]);
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                work();
            }
        }
    }

    public synchronized static void work() {
        data[0]++;
    }

}

