package generic.ex5;

import generic.ex3.Cat;
import generic.ex3.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.<Dog>checkUp(dog);
        AnimalMethod.<Cat>checkUp(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.<Dog>bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
