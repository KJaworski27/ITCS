//Author Kevin Jaworski
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Sweet extends Dancer implements Runnable
{
    //Default constructor
    public Sweet()
    {
        super(1, 1, Display.EAST, 0);
    }

    //4 Argument Constructor
    public Sweet(int x, int y, int dir, int beepers)
    {
        super(x, y, dir, beepers);
    }

    public void danceStep()
    {
        move();
        move();
        move();
        turnAround();
        move();
        move();
        move();
        turnAround();
    }

    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            danceStep();
        }
    }
}