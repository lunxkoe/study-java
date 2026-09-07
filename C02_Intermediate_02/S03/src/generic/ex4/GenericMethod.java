package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    // <T>: 제너릭 메서드라는 의미 (메서드 안에서만 유효함)
    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
