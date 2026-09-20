package thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasMainV1 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());


        boolean result1 = atomicInteger.compareAndSet(0, 1);
        // - 현재 값이 0이면 1로 바꿔달라는 의미
        System.out.println("result1 = " + result1 + ", value = " + atomicInteger.get());

        boolean result2 = atomicInteger.compareAndSet(0, 1);
        // - 위에서 1로 변경이 되었기 때문에 false가 나옴
        System.out.println("result2 = " + result2 + ", value = " + atomicInteger.get());
    }
}
