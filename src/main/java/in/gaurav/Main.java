package in.gaurav;


import in.gaurav.Strategies.FlyByJet;
import in.gaurav.Strategies.FlyByWings;
import in.gaurav.Strategies.WalkByWheel;

public class Main {
    public static void main(String[] args) {

        Robot robot = new CompanionRobot(
                new FlyByWings(),
                new WalkByWheel()

        );
        robot.robotProjection();
        Robot robot1 = new FlyingRobot(new FlyByJet());
        robot1.robotProjection();
    }
}