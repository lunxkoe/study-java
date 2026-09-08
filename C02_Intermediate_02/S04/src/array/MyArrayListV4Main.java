package array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String s1 = stringList.get(0);
        System.out.println("s1 = " + s1);
        String s2 = stringList.get(1);
        System.out.println("s2 = " + s2);
        String s3 = stringList.get(2);
        System.out.println("s3 = " + s3);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer int1 = intList.get(0);
        System.out.println("int1 = " + int1);
        Integer int2 = intList.get(1);
        System.out.println("int2 = " + int2);
        Integer int3 = intList.get(2);
        System.out.println("int3 = " + int3);
    }
}
