package thread.executor.future;

import java.util.concurrent.*;

import static util.MyLogger.log;

public class SumTaskMainV2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = es.submit(new SumTask(1, 50));
        Future<Integer> future2 = es.submit(new SumTask(51, 100));

        Integer result1 = future1.get();
        Integer result2 = future2.get();

        log("taks1.result = " + result1);
        log("taks2.result = " + result2);

        int result = result1 + result2;
        log("result = " + result);

        es.close();
    }

    static class SumTask implements Callable<Integer> {

        private final int startValue;
        private final int endValue;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() throws Exception {
            log("작업 시작");
            Thread.sleep(2000);
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            log("작업 완료 result = " + sum);
            return sum;
        }
    }
}
