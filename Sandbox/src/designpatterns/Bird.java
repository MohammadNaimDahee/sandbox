package designpatterns;

import designpatterns.creationalpatterns.strategypattern.ItFlys;

public class Bird extends Animal{

    public Bird() {
        super();

        setSound("Tweet");

        flyingType = new ItFlys();
    }
}
