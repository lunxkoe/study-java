package thread.executor.future;

import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class FutureExceptionMain {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);

        log("작업 전달");
        Future<Integer> future = es.submit(new ExCallable());
        sleep(1000); // 작업이 끝날 때까지 대기


        try {
            log("future.get() 호출 시도, future.state(): " + future.state());
            Integer result = future.get(); // 무슨 예외가 발생했는지 가지고 있음 (ExecutionException(e))
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) { // 실행 중 터지는 예외
            log("e = " + e);
            Throwable cause = e.getCause();
            log("cause = " + cause);
        }
    }

    static class ExCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            log("Callable 실행, 예외 발생");
            throw new IllegalStateException("ex!");
        }
    }
}
