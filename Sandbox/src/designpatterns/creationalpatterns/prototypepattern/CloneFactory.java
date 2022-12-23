package designpatterns.creationalpatterns.prototypepattern;

public class CloneFactory {

    public Animal getClone(Animal animalSample) {
        return  animalSample.makeCopy();
    }
}
