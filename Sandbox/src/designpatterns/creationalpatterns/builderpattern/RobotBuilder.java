package designpatterns.creationalpatterns.builderpattern;

public interface RobotBuilder {

    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();

    public Robot getRobot();
}
