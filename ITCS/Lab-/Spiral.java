//Author Kevin Jaworski

import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class Spiral {
   public static void main(String[] args) {
      // makes display
      Display.setSize(10, 9);
      Display.setSpeed(15);

      // makes Multitasker Dude
      Multitasker vegeta = new Multitasker();

      // draws spiral

      vegeta.turnRight();
      for (int i = 0; i < 9; i++) {
         vegeta.dropAndMove();
      }
      vegeta.putBeeper();
      vegeta.turnLeft();

      for (int i = 0; i < 8; i++) {
         vegeta.moveAndDrop();
      }

      vegeta.turnLeft();

      for (int i = 0; i < 9; i++) {
         vegeta.moveAndDrop();
      }

      vegeta.turnLeft();

      for (int i = 0; i < 6; i++) {
         vegeta.moveAndDrop();
      }

      vegeta.turnLeft();
      for (int i = 0; i < 7; i++) {
         vegeta.moveAndDrop();
      }

      vegeta.turnLeft();
      for (int i = 0; i < 4; i++) {
         vegeta.moveAndDrop();
      }

      vegeta.turnLeft();
      for (int i = 0; i < 5; i++) {
         vegeta.moveAndDrop();
      }
      vegeta.turnLeft();
      for (int i = 0; i < 2; i++) {
         vegeta.moveAndDrop();
      }
      vegeta.turnLeft();
      for (int i = 0; i < 3; i++) {
         vegeta.moveAndDrop();
      }
   }
}
