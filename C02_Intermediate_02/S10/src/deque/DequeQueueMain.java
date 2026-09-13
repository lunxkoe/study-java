package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        // 데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("queue = " + queue);

        // 데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);
    }
}
