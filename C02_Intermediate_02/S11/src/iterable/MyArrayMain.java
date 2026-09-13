package iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray array = new MyArray(new int[] {1, 2, 3, 4});

        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

        System.out.println("for-each 사용");
        // Iterable 인터페이스를 구현한 객체에 대해서 향상된 for문을 사용할 수 있게 해줌
        for (int value : array) {
            System.out.println("value = " + value);
        }
    }
}
