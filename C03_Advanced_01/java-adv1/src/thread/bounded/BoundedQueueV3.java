package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BoundedQueueV3 implements BoundedQueue {

    private final Queue<String> queue = new ArrayDeque<>();
    // - synchronized를 사용해서 한 번 한 스레드에서만 호출할 수 있기 때문에 동기화 문제가 발생하지 않음
    private final int max;

    public BoundedQueueV3(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        while (queue.size() == max) {
            log("[put] 큐가 가득 참. 대기: " + data);
            try {
                wait(); // Runnable -> Waiting + 락 반납
                log("[put] 생산자 깨어남"); // Runnable
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        queue.offer(data);
        log("[put] 생산자 데이터 저장, notify() 호출");
        notify(); // 대기 스레드, Wait -> Blocked
    }

    @Override
    public synchronized String take() {
        while (queue.isEmpty()) {
            log("[take] 큐에 데이터가 없음. 소비자 대기");
            try {
                wait();
                log("[take] 소비자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String data = queue.poll();
        log("[take] 소비자 데이터 획득, notify() 호출");
        notify(); // 대기 스레드 Wait -> Blocked
        return data;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
