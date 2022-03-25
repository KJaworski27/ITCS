//Author Kevin Jaworski
//import edu.fcps.karel2.Robot;
//import edu.fcps.karel2.Display;

public class BoxTopper extends Racer {

   public BoxTopper(int y) {
      super(y);
   }

   public void jumpRight() {
      turnLeft();
      while (!rightIsClear()) {
         move();
      }
      turnRight();
      move();

      while (!rightIsClear()) {
         move();
      }
      turnRight();
      while (frontIsClear()) {
         move();
      }
      turnLeft();
   }
}