//Author Kevin Jaworski
//import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class MakePyramid {
   public static void main(String[] args) {
      Athlete nicolasMucelsDeGuercio = new Athlete();

      nicolasMucelsDeGuercio.putBeeper();
      nicolasMucelsDeGuercio.move();
      nicolasMucelsDeGuercio.turnRight();
      nicolasMucelsDeGuercio.move();
      nicolasMucelsDeGuercio.turnRight();
      nicolasMucelsDeGuercio.putBeeper();
      nicolasMucelsDeGuercio.move();
      nicolasMucelsDeGuercio.putBeeper();
      nicolasMucelsDeGuercio.turnLeft();
      nicolasMucelsDeGuercio.move();
      nicolasMucelsDeGuercio.turnLeft();

      // place a column
      for (int i = 0; i < 3; i++) {
         nicolasMucelsDeGuercio.putBeeper();
         nicolasMucelsDeGuercio.move();
      }

      nicolasMucelsDeGuercio.turnRight();
      nicolasMucelsDeGuercio.move();
      nicolasMucelsDeGuercio.turnRight();

      // place a column
      for (int i = 0; i < 4; i++) {
         nicolasMucelsDeGuercio.putBeeper();
         nicolasMucelsDeGuercio.move();
      }
   }
}