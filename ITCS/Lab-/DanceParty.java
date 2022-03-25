//Author Kevin Jaworski
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class DanceParty
{
    public static void main(String[] args)
    {
        Display.setSize(30, 30);
        Display.setSpeed(7);

        Dancer d1 = new Sweet(7, 7, 1, 0);
        Dancer d2 = new Capn(15, 7, 1, 0);
        Dancer d3 = new KK(23, 7, 1, 0);

        Dancer d4 = new Sweet(7, 15, 1, 0);
        Dancer d5 = new Capn(15, 15, 1, 0);
        Dancer d6 = new KK(23, 15, 1, 0);

        Dancer d7 = new Sweet(7, 23, 1, 0);
        Dancer d8 = new Capn(15, 23, 1, 0);
        Dancer d9 = new KK(23, 23, 1, 0);

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);
        Thread t4 = new Thread(d4);
        Thread t5 = new Thread(d5);
        Thread t6 = new Thread(d6);
        Thread t7 = new Thread(d7);
        Thread t8 = new Thread(d8);
        Thread t9 = new Thread(d9);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        
    }
}