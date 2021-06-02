package structural.bridge.workouts;

import main.Main;

public class Gym implements Workout
{
    private int squatBarbellWeight;
    private int chestBarbellWeight;
    private int rowingBarbellWeight;
    private int pullPoints;
    private int pushPoints;
    private int legsPoints;


    public Gym(int pullPoints, int pushPoints, int legsPoints)
    {
        this.setPullPoints(pullPoints);
        this.setPushPoints(pushPoints);
        this.setLegsPoints(legsPoints);
    }

    @Override
    public void getPushStatus()
    {
        System.out.println("Your current bench press load is " + chestBarbellWeight);
    }

    @Override
    public void getPullStatus()
    {
        System.out.println("Your current rowing load is " + rowingBarbellWeight);
    }

    @Override
    public void getLegsStatus()
    {
        System.out.println("Your current squat load is " + squatBarbellWeight);
    }

    @Override
    public int getPullPoints()
    {
        return pullPoints;
    }

    @Override
    public void setPullPoints(int pullPoints)
    {
        this.pullPoints = Math.min(pullPoints, 100);
        this.rowingBarbellWeight = this.pullPoints;
    }

    @Override
    public int getPushPoints()
    {
        return pushPoints;
    }

    @Override
    public void setPushPoints(int pushPoints)
    {
        this.pushPoints = Math.min(pushPoints, 200);
        this.chestBarbellWeight = (int)(this.pushPoints * 1.1);
    }

    @Override
    public int getLegsPoints()
    {
        return legsPoints;
    }

    @Override
    public void setLegsPoints(int legsPoints)
    {
        this.legsPoints = Math.min(legsPoints,200);
        this.squatBarbellWeight = (int) (this.legsPoints * 1.5);
    }
}
