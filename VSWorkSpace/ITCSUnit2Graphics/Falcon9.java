//Required import statements
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings({"unused", "serial"})
public class Falcon9 extends Rocket
{
    //constants
    private double startingMass;
    private double burnTime;
    private double fuelConsumption;
    private double thrust;
    private double deltaTime;
    private double earthMass;
    private double burnRate;
    private double scale;
    private double fixedOffset;

    //Non constants    
    private double rocketMass;
    private double altitude;
    private double timeElapsed;
    private double radius;
    private double fuelUsed;

    //Kinematics vriables
    private double fG;
    private double fNet;
    private double yVelocity;
    private double yAcceleration;

    public Falcon9(double x, double y, double width, double height, double deltaTime) 
    {
        super(x, y, width, height);
        this.startingMass = 541300;
        this.burnTime = 162;
        this.fuelConsumption = 398900;
        this.thrust = 6806000;
        this.deltaTime = deltaTime;
        this.earthMass = 5.98 * Math.pow(10, 24);
        this.burnRate = fuelConsumption / burnTime;
        this.scale = 100000;
        
        this.rocketMass = startingMass;
        this.altitude = this.getHeight() / 2;
        this.timeElapsed = 0;
        this.radius = 6.38 * Math.pow(10, 6);
        this.fuelUsed = 0;
        
        
        this.fG = 0;
        this.fNet = 0;
        this.yVelocity = 0;
        this.yAcceleration = 0;
        
        this.fixedOffset = altitude;
    }
    
    public void move(double screenHeight)
    {
        if(timeElapsed >= 162)
        {


            yAcceleration = 0;
            yVelocity = 0;
        }else
        {
            rocketMass = rocketMass - (burnRate * deltaTime);
            fuelUsed = burnRate * timeElapsed;
            fG = 6.67 * Math.pow(10, -11) * (earthMass * rocketMass / Math.pow(radius, 2));
            fNet = thrust - fG;
            yAcceleration = fNet / rocketMass;
            yVelocity = yVelocity + yAcceleration * deltaTime;
            altitude = altitude + yVelocity * deltaTime;
            setY(screenHeight * (1 - altitude / 125000) - fixedOffset);
        }

        timeElapsed += deltaTime;
    }


    //------------------------------|
    //   GETTERS AND SETTERS        |
    //   DON'T DELETE THIS CODE     |
    //   THERE IS A HUGE GAP HERE   |
    //   SO YOU DON'T DELETE THIS   |
    //   WHEN DELETING A HUGE       |
    //   CHUNK OF CODE              |
    //------------------------------|


    public double getStartingMass() {
        return startingMass;
    }

    public void setStartingMass(double startingMass) {
        this.startingMass = startingMass;
    }

    public double getBurnTime() {
        return burnTime;
    }

    public void setBurnTime(double burnTime) {
        this.burnTime = burnTime;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    public void setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
    }

    public double getEarthMass() {
        return earthMass;
    }

    public void setEarthMass(double earthMass) {
        this.earthMass = earthMass;
    }

    public double getRocketMass() {
        return rocketMass;
    }

    public void setRocketMass(double rocketMass) {
        this.rocketMass = rocketMass;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(double timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getfG() {
        return fG;
    }

    public void setfG(double fG) {
        this.fG = fG;
    }

    public double getfNet() {
        return fNet;
    }

    public void setfNet(double fNet) {
        this.fNet = fNet;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    public double getyAcceleration() {
        return yAcceleration;
    }

    public void setyAcceleration(double yAcceleration) {
        this.yAcceleration = yAcceleration;
    }

    public double getBurnRate() {
        return burnRate;
    }

    public void setBurnRate(double burnRate) {
        this.burnRate = burnRate;
    }

    public double getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public double getFixedOffset() {
        return fixedOffset;
    }

    public void setFixedOffset(double fixedOffset) {
        this.fixedOffset = fixedOffset;
    }
}