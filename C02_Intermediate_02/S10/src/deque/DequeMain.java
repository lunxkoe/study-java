package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerFirst(3);
        System.out.println(deque);
        deque.offerFirst(4);
        System.out.println(deque);

        // 다음에 꺼낼 데이터 조회
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekFirst() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollLast());
    }
}
