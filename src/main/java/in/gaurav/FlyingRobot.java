package in.gaurav;

import in.gaurav.Strategies.Flyable;

public class FlyingRobot implements Robot{

    private final Flyable flyable;
    public FlyingRobot(Flyable flyable) {
        this.flyable = flyable;
    }
    @Override
    public void robotProjection() {
        System.out.println("This robot is projected for Flying Robot.");
        flyable.fly();
    }
}
