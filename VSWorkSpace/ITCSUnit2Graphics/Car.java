import java.util.ArrayList;

public class Car 
{
    private int distanceTraveled;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private int job;
    private double money;
    private int spareTires;
    private int spareWheels;
    private int enginePower;
    
    //constructors
    public Car(int distanceTraveled, ArrayList<Passenger> passengers, int job, double money, int spareTires, int spareWheels, int enginePower) {
        this.distanceTraveled = distanceTraveled;
        this.passengers = passengers;
        this.job = job;
        this.money = money;
        this.spareTires = spareTires;
        this.spareWheels = spareWheels;
        this.enginePower = enginePower;
    }

    public Car() 
    {

    }

    //Getters and Setters
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getSpareTires() {
        return spareTires;
    }

    public void setSpareTires(int spareTires) {
        this.spareTires = spareTires;
    }

    public int getSpareWheels() {
        return spareWheels;
    }

    public void setSpareWheels(int spareWheels) {
        this.spareWheels = spareWheels;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
