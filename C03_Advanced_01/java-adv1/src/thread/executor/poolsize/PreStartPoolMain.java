package thread.executor.poolsize;

import java.util.concurrent.*;

import static thread.executor.ExecutorUtils.printState;
import static util.ThreadUtils.sleep;

public class PreStartPoolMain {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1000);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) es;
        poolExecutor.prestartAllCoreThreads();
        sleep(1000);
        printState(es);
    }
}
