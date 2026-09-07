package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T의 타입 결정 (타입 인자)
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

//        integerBox.set("100"); // 컴파일 시점에 잡아줌

        // 타입 추론: 생성하는 재네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<Integer>(); // new GenericBox<>()도 가능
    }
}
