package in.gaurav;

import in.gaurav.Strategies.Flyable;
import in.gaurav.Strategies.Walkable;

public class CompanionRobot implements Robot{

    private final Flyable flyable;
    private final Walkable walkable;
    public CompanionRobot(
            Flyable flyable,
            Walkable walkable) {
        this.walkable = walkable;
        this.flyable = flyable;
    }
    @Override
    public void robotProjection() {
        System.out.println("This robot is projected for Companion Robot");
        walkable.walk();
        flyable.fly();
    }



}
