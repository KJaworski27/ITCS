//Author Kevin Jaworksi
//import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class HillClimber extends Climber {
   // constructors
   public HillClimber() {
      super();
   }

   public HillClimber(int x) {
      super(x);
   }

   // starts facing right, moves up once and to the right twice. Ends facing right.
   public void climbUpRight() {
      turnLeft();
      move();
      turnRight();
      move();
      move();
   }

   // same as climbUpRight, but moves to the left instead
   public void climbUpLeft() {
      turnRight();
      move();
      turnLeft();
      move();
      move();
   }

   // moves to the right twice, moves down and moves to the right again. Ends
   // facing right
   public void climbDownRight() {
      move();
      move();
      turnRight();
      move();
      turnLeft();
   }

   // same as climbDownRight but goes to the left
   public void climbDownLeft() {
      move();
      move();
      turnLeft();
      move();
      turnRight();
   }
}