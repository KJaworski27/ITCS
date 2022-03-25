//Author Kevin Jaworski
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Capn extends Dancer implements Runnable
{
    //Default constructor
    public Capn()
    {
        super(1, 1, Display.EAST, 0);
    }

    //4 Argument Constructor
    public Capn(int x, int y, int dir, int beepers)
    {
        super(x, y, dir, beepers);
    }

    public void danceStep()
    {
        for(int i = 0; i < 4; i++)
        {
            move();
            move();
            turnLeft();
        }
    }

    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            danceStep();
        }
    }
}