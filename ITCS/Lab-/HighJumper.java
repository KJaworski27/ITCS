//Author Kevin Jaworski
//import edu.fcps.karel2.Robot;
//import edu.fcps.karel2.Display;

public class HighJumper extends Racer {

   public HighJumper(int y) {
      super(y);
   }

   public void jumpRight() {
      // moves left
      turnLeft();

      // moves while there is a hurdle to the robot's right
      while (!rightIsClear()) {
         move();
      }

      // clears the gap
      turnRight();
      move();
      turnRight();

      // moves to the ground and turns left
      while (frontIsClear()) {
         move();
      }
      turnLeft();
   }
}