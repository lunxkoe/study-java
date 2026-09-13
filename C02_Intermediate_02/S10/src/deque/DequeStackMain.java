package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        // 데이터 추가
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);

        System.out.println("stack.peek() = " + stack.peek());

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
    }
}
