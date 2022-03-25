// TrackStar.java			
// ITCS

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class TrackStar extends Athlete {
   private int steps;
   private int laps;
   private String name;

   
   // Creates a TrackStart with the given name at
   // (1, 1), facing East, with 0 beepers
   public TrackStar(String name) {
      super(1, 1, Display.EAST, 0);
      this.name = name;
   }
   
   
   // Runs exactly one lap.
   // Use moveAndCount to move
   // Add one to the number of laps run.  
   // The TrackStar will begin facing East and finish facing East.
   public void runLap() {
      for(int i = 0; i < 4; i++)
      {
         while(frontIsClear())
         {
            moveAndCount();
         }
         turnLeft();
      }
      laps++;
   }
   
   
   // Moves one space and counts every step taken
   public void moveAndCount() {
      super.move();
      steps++;
   }  
   
   
   // Returns the number of steps taken
   public int getSteps() {
  
      return steps;
   }
   
   
   // Returns the number of laps taken
   public int getLaps() {
      return laps;
   }
   
   // Returns the name of the TrackStar
   public String getName() {
      return name;
   }
   
   // Returns the number of miles ran, rounded down.
   // One mile equals 20 steps.
   public int calculateMiles() {
      return this.steps/20;
   }
   
   // Resets the number of steps taken to 0.
   // Resets the number of laps taken to 0.
   public void resetCount() {
      steps = 0;
      laps = 0;            
   }
   
   
   // Runs the specified number of laps by numLaps.
   // Call runLap, do not re-write lap running code
   public void warmUp(int numLaps) {
      for(int i = 0; i < numLaps; i++)
      {
         runLap();
      }
   }
}