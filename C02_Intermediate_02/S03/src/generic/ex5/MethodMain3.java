package generic.ex5;

import generic.ex3.Cat;
import generic.ex3.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.<Cat>printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
