package work.$SE_Rabbit.lesson5;

import work.$SE_Rabbit.lesson28.*;

public class MineLesson28 {

    public static void main(String[] args) {

        Body body = new Body();

        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Leg leg = new Leg();


      //  Robot robot = new Robot(body,smallHead);
        Robot<SmallHead> robot = new Robot<SmallHead>( body,smallHead );
        Robot<BigHead> robot1 = new Robot<BigHead>(body,bigHead  );
        robot.getHead().burn();
        robot1.getHead().turn();
        Robot<MediumHead> robot2 = new Robot<MediumHead>(body,mediumHead  );
    //    Robot robot2 = new Robot( body,leg );

     //   robot.foo(robot2);
    }
}