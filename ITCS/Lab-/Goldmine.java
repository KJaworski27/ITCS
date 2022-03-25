
//author Kevin Jaworski
import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

public class Goldmine {
   public static void main(String[] args) {
      // opens map
      Display.openWorld("maps/mine.map");
      Display.setSpeed(10);

      // makes miners
      Miner kris = new Miner(1, 1, Display.NORTH, 0);
      Miner lancer = new Miner(1, 8, Display.EAST, 0);
      Miner ralsei = new Miner(8, 1, Display.WEST, 0);
      Miner susie = new Miner(8, 6, Display.SOUTH, 0);
      Miner noelle = new Miner(3, 6, Display.EAST, 0);

      // moves noelle, picks up beepers, hands them off to susie
      noelle.move();
      for (int i = 0; i < 6; i++) {
         noelle.pickBeeper();
      }
      for (int i = 0; i < 4; i++) {
         noelle.move();
      }
      for (int i = 0; i < 6; i++) {
         noelle.putBeeper();
      }

      /*
       * susie picks up noelle's beepers, moves, picks up more, and then hands them
       * off to ralsei
       */
      for (int i = 0; i < 6; i++) {
         susie.pickBeeper();
      }
      for (int i = 0; i < 4; i++) {
         susie.move();
      }
      for (int i = 0; i < 7; i++) {
         susie.pickBeeper();
      }
      susie.move();
      for (int i = 0; i < 13; i++) {
         susie.putBeeper();
      }
      /*
       * ralsei picks up susie's beepers, moves, picks up more, and then hands them
       * off to kris
       */
      for (int i = 0; i < 13; i++) {
         ralsei.pickBeeper();
      }
      for (int i = 0; i < 4; i++) {
         ralsei.move();
      }
      for (int i = 0; i < 8; i++) {
         ralsei.pickBeeper();
      }
      for (int i = 0; i < 3; i++) {
         ralsei.move();
      }
      for (int i = 0; i < 21; i++) {
         ralsei.putBeeper();
      }
      /*
       * kris picks up ralse's beepers, moves, picks up beepers, moves again and hands
       * them off to lancer
       */
      for (int i = 0; i < 21; i++) {
         kris.pickBeeper();
      }
      for (int i = 0; i < 6; i++) {
         kris.move();
      }
      for (int i = 0; i < 9; i++) {
         kris.pickBeeper();
      }
      kris.move();
      for (int i = 0; i < 30; i++) {
         kris.putBeeper();
      }
      // lancer takes the beepers out of the mine and leaves
      for (int i = 0; i < 30; i++) {
         lancer.pickBeeper();
      }
      for (int i = 0; i < 9; i++) {
         lancer.move();
      }
      for (int i = 0; i < 30; i++) {
         lancer.putBeeper();
      }
      lancer.move();

      // everyone dies
      noelle.explode();
      susie.explode();
      ralsei.explode();
      kris.explode();
   }
}