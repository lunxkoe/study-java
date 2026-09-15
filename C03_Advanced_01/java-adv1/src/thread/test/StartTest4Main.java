package thread.test;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable(1000, "A");
        MyRunnable runnable2 = new MyRunnable(500, "B");

        Thread thread1 = new Thread(runnable1, "Thread-A");
        Thread thread2 = new Thread(runnable2, "Thread-B");

        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {

        private final int sleepTime;
        private final String output;

        public MyRunnable(int sleepTime, String output) {
            this.sleepTime = sleepTime;
            this.output = output;
        }

        @Override
        public void run() {
            while (true) {
                log(output);
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
