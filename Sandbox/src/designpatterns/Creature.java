package designpatterns;

abstract public class Creature {

    protected String name;
    protected int weight;
    protected String sound;

    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setWeight(double weight);
    public abstract double getWeight();
}
