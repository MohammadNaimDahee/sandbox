package designpatterns.creationalpatterns.strategypattern;

import designpatterns.Animal;
import designpatterns.Bird;
import designpatterns.Dog;

public class Run {

    public static void main(String[] args) {
// Use Strategy Pattern

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog : " + sparky.tryToFly());
        System.out.println("Tweety : " + tweety.tryToFly());

        sparky.setFlyingType(new ItFlys());
        System.out.println("Dog : " + sparky.tryToFly());
    }
}
