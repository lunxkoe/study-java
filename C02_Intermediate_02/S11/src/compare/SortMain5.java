package compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser();
        user1.setId("A");
        user1.setAge(20);

        MyUser user2 = new MyUser();
        user2.setId("B");
        user2.setAge(10);

        MyUser user3 = new MyUser();
        user3.setId("C");
        user3.setAge(30);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(user1);
        treeSet1.add(user2);
        treeSet1.add(user3);
        System.out.println(treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(user1);
        treeSet2.add(user2);
        treeSet2.add(user3);
        System.out.println(treeSet2);
    }
}
