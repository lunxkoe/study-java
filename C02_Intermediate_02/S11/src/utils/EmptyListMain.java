package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Object> list2 = Collections.emptyList(); // 자바 5
        List<Object> list3 = List.of();// 자바 9

        System.out.println("list2.getClass() = " + list2.getClass());
//        list2.getClass() = class java.util.Collections$EmptyList

        System.out.println("list3.getClass() = " + list3.getClass());
//        list3.getClass() = class java.util.ImmutableCollections$ListN

        List<Integer> list4 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);
        arrList.set(0, 100);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);
        // 주의: arr의 참조가 arrList로 들어감
    }
}
