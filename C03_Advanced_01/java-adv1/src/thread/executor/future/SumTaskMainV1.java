package thread.executor.future;

import static util.MyLogger.log;

public class SumTaskMainV1 {

    public static void main(String[] args) throws InterruptedException {

        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int result = task1.result + task2.result;
        log("result = " + result);
    }

    static class SumTask implements Runnable {

        private final int startValue;
        private final int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result = sum;
        }
    }
}
