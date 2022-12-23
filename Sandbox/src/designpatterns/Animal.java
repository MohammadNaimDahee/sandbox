package designpatterns;

import designpatterns.creationalpatterns.strategypattern.Flys;

public class Animal {

    private String name;
    private  double height;
    private int weight;
    private String sound;
    private String favFood;
    private  double speed;

    // Strategy Pattern
    // we use the Flys interface as a reference variable instead of using an interface in a traditional way
    // This way is composition, to change the capabilities of objects at run time.
    public Flys flyingType;

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setName(String name) { this.name = name; }
    public String getName() {return this.name; }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be bigger than zero");
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingType(Flys newFlyType) {
        flyingType = newFlyType;
    }
}
