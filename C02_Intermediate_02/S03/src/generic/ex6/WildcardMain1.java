package generic.ex6;

import generic.ex3.Animal;
import generic.ex3.Cat;
import generic.ex3.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.<Dog>printGenericV1(dogBox);
        WildcardEx.<Dog>printWildcardV1(dogBox);

        WildcardEx.<Dog>printGenericV2(dogBox);
        WildcardEx.<Dog>printWildcardV2(dogBox);

        Dog returnDog = WildcardEx.<Dog>printAndReturnGeneric(dogBox);
        Animal returnAnimal = WildcardEx.<Dog>printAndReturnWildcard(dogBox);
    }
}
