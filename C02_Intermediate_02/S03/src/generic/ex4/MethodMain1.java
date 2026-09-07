package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Integer object = (Integer) GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달 - 메소드를 호출하기 전에 결정하고 나서 호출함
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        System.out.println("integerValue = " + integerValue);
    }
}
