//author Kevin Jaworski

import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class ClimbEveryMountain2 {
   public static void main(String[] args) {
      // open map
      Display.openWorld("maps/mountain3.map");

      // make climbers
      Climber sean = new Climber(8);
      Climber shaun = new Climber(8);

      /*
       * sean climbs up the first hill, picks up a beeper, comes back and places the
       * beeper at the starting position
       */

      sean.turnRight();
      sean.move();
      sean.climbUpRight();
      sean.pickBeeper();
      sean.turnAround();
      sean.climbDownLeft();
      sean.move();
      sean.putBeeper();

      /*
       * shaun picks up the beeper, takes it to the top of the second mountain and
       * comes back
       */

      shaun.pickBeeper();
      shaun.turnLeft();
      shaun.move();
      for (int i = 0; i < 5; i++) {
         shaun.climbUpLeft();
      }
      shaun.putBeeper();
      shaun.turnAround();
      for (int i = 0; i < 5; i++) {
         shaun.climbDownRight();
      }
      shaun.move();
   }
}