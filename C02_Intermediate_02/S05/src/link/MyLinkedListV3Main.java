package link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String str1 = stringList.get(0);
        System.out.println("str1 = " + str1);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer int1 = intList.get(0);
        System.out.println("int1 = " + int1);
    }
}
