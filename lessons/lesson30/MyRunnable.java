package lessons.lesson30;

import lessons.ThreadTester;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        ThreadTester.work();
    }
}
