package designpatterns.creationalpatterns.strategypattern;

public class CantFly implements Flys {
    public String fly() {
        return "I can't fly";
    }
}
