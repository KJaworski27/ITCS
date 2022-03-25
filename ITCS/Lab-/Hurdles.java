// Hurdles.java
// ITCS

import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
  
public class Hurdles {
   
   // declare and initialize array of map choices for the dialogue drop-down options
   public static final String[] choices = {"hurdle1", "hurdle2", "hurdle3", "steeple1", "steeple2", "steeple3", "boxtop1", "boxtop2", "boxtop3"};   
   
   public static void race(Racer temp)
   {
      while(!temp.nextToABeeper())
      {
         while(temp.frontIsClear() && !temp.nextToABeeper())
         {
            temp.move();
         }
         if(!temp.nextToABeeper())
         {
            temp.jumpRight();
         }
      }
   }
   public static void main(String[] args) 
   {
      // open dialogue box and request user input of map choices
      String mapChoice = (String)JOptionPane.showInputDialog(null,"Choose an map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
         
      // open selected map and set size and speed
      Display.openWorld("maps/"+ mapChoice +".map");
      Display.setSize(18, 18);
      Display.setSpeed(10);
      
      Racer turbo;
      
      if (mapChoice.contains("hurdle")) {
         turbo = new Racer(1);
      }else if (mapChoice.contains("steeple"))
      {
         turbo = new HighJumper(1);
      }else if (mapChoice.contains("boxtop"))
      {
         turbo = new BoxTopper(1);
      }
      else {
         turbo = null;
      }
      
      race(turbo);        
      //raceTest(turbo);
      //System.out.println("test complete");
     
   }
 
 
   // Test the jumpRight method.
   // The racer will move, move, then jumpRight and jump over the hurdle.
   // The racer will finish next to the hurdle, facing to the east (right).
   public static void raceTest(Racer racer) {
      racer.move();
      racer.move();
      racer.jumpRight();
   
   }
   
   
}