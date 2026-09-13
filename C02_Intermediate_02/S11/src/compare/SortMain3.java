package compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser();
        user1.setId("A");
        user1.setAge(20);

        MyUser user2 = new MyUser();
        user2.setId("B");
        user2.setAge(10);;

        MyUser[] array = new MyUser[] {user1, user2};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator 정렬");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));

        List<MyUser> list = new LinkedList<>();
        list.add(user1);
        list.add(user2);

        list.sort(new IdComparator()); // 권장
        System.out.println(list);

//        Collections.sort(list);
//        System.out.println(list);
    }
}
