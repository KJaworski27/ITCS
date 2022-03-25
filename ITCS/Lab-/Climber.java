// Lab03: Climb Every Mountain
// Climber.java		

import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

// A Climber Robot can climb up and down mountain
public class Climber extends Athlete {

   // The default constructor starts at (1,1), faces North, and has
   // 1 beeper
   public Climber() {
      super(1, 1, Display.NORTH, 1);
   }

   // Same as default constructor, but you specify the x pos
   public Climber(int x) {
      super(x, 1, Display.NORTH, 1);
   }

   // Climber is facing right and moves up one level and finishes facing right
   public void climbUpRight() {
      turnLeft();
      move();
      move();
      turnRight();
      move();

   }

   // same as climbUpRight, but moves to the left instead
   public void climbUpLeft() {
      turnRight();
      move();
      move();
      turnLeft();
      move();
   }

   // moves to the right, moves down twice and moves to the right again. Ends
   // facing right
   public void climbDownRight() {
      move();
      turnRight();
      move();
      move();
      turnLeft();
   }

   // same as climbDownRight but goes to the left
   public void climbDownLeft() {
      move();
      turnLeft();
      move();
      move();
      turnRight();
   }
}
