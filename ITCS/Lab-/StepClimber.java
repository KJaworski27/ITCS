//Author Kevin Jaworksi
//import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class StepClimber extends Climber {
   // constructors
   public StepClimber() {
      super();
   }

   public StepClimber(int x) {
      super(x);
   }

   // Climber is facing right and moves up one level and finishes facing right
   public void climbUpRight() {
      turnLeft();
      move();
      turnRight();
      move();

   }

   // same as climbUpRight, but moves to the left instead
   public void climbUpLeft() {
      turnRight();
      move();
      turnLeft();
      move();
   }

   // moves to the right, moves down once and moves to the right again. Ends facing
   // right
   public void climbDownRight() {
      move();
      turnRight();
      move();
      turnLeft();
   }

   // same as climbDownRight but goes to the left
   public void climbDownLeft() {
      move();
      turnLeft();
      move();
      turnRight();
   }
}