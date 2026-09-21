package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static thread.executor.ExecutorUtils.*;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ExecutorBasicMain {

    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(
                2,
                2,
                0,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>()
        );

        log("== 초기 상태 ==");
        printState(es);
        es.execute(new RunnableTask("taskA")); // corePoolSize까지는 쓰레드를 만들고
        es.execute(new RunnableTask("taskB")); // corePoolSize까지는 쓰레드를 만들고
        es.execute(new RunnableTask("taskC")); // 여기서부터는 쓰레드를 만들지 않고, 재사용
        es.execute(new RunnableTask("taskD"));
        es.execute(new RunnableTask("taskE"));
        log("== 작업 수행 중 ==");
        printState(es);

        sleep(5000);
        printState(es);

        es.close();
        log("== shutdown ==");
        printState(es);
    }
}
