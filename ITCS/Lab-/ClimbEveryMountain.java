//author Kevin Jaworski

import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class ClimbEveryMountain {
   public static void main(String[] args) {
      // define map
      Display.openWorld("maps/mountain.map");
      // define Climbers
      Climber climbDude = new Climber(8);
      Climber climbMan = new Climber(8);

      climbDude.putBeeper();
      climbMan.putBeeper();

      // climb up the mountain
      climbDude.turnRight();
      climbMan.turnRight();
      climbDude.move();
      climbMan.move();
      climbDude.climbUpRight();
      climbMan.climbUpRight();
      climbDude.climbUpRight();
      climbMan.climbUpRight();
      climbDude.climbUpRight();
      climbMan.climbUpRight();

      // get beeper and get back to top
      climbDude.climbDownRight();
      climbMan.climbDownRight();
      climbDude.climbDownRight();
      climbMan.climbDownRight();
      climbDude.pickBeeper();
      climbDude.turnAround();
      climbMan.turnAround();
      climbDude.climbUpLeft();
      climbMan.climbUpLeft();
      climbDude.climbUpLeft();
      climbMan.climbUpLeft();

      // return and place beeper
      climbDude.climbDownLeft();
      climbMan.climbDownLeft();
      climbDude.climbDownLeft();
      climbMan.climbDownLeft();
      climbDude.climbDownLeft();
      climbMan.climbDownLeft();
      climbDude.move();
      climbMan.move();
      climbDude.putBeeper();
   }
}