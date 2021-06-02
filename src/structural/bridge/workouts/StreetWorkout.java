package structural.bridge.workouts;

import structural.bridge.workouts.exercises.PullUpProgression;
import structural.bridge.workouts.exercises.PushUpProgression;

public class StreetWorkout implements Workout
{
    private boolean hasDipsBars;
    private PullUpProgression pullUpProgression;
    private PushUpProgression pushUpProgression;
    private int pullPoints;
    private int pushPoints;

    public StreetWorkout(boolean hasDipsBars, int pullPoints, int pushPoints)
    {
        this.hasDipsBars = hasDipsBars;
        this.setPullPoints(pullPoints);
        this.setPushPoints(pushPoints);
    }

    @Override
    public void getPushStatus()
    {
        System.out.println("Your actual push up progression is " + pushUpProgression.name());
    }

    @Override
    public void getPullStatus()
    {
        System.out.println("Your actual pull-up progression is " + pullUpProgression.getProgressionStatus());
    }

    @Override
    public void getLegsStatus()
    {
        System.out.println("You are street workouter. You don't do legs!");
    }

    @Override
    public int getPullPoints()
    {
        return pullPoints;
    }

    @Override
    public void setPullPoints(int newPullPoints)
    {
        pullPoints = Math.min(newPullPoints,200);
        pullPoints = Math.max(0, pullPoints);
        if (pullPoints < 2)
            pullUpProgression = PullUpProgression.WALL_PULL_UP;
        else if (pullPoints < 10)
            pullUpProgression = PullUpProgression.AUSTRALIAN_PULL_UP;
        else if (pullPoints < 20)
            pullUpProgression = PullUpProgression.NEGATIVE_PULL_UP;
        else if (pullPoints < 30)
            pullUpProgression = PullUpProgression.PULL_UP;
        else if (pullPoints < 50)
            pullUpProgression = PullUpProgression.ARCHER_PULL_UP;
        else if (pullPoints < 80)
            pullUpProgression = PullUpProgression.NEGATIVE_ONE_ARM_PULL_UP;
        else
            pullUpProgression = PullUpProgression.ONE_ARM_PULL_UP;
    }

    @Override
    public int getPushPoints()
    {
        return pushPoints;
    }

    @Override
    public void setPushPoints(int newPushPoints)
    {

        pushPoints = Math.min(newPushPoints, 200);
        pushPoints = Math.max(0, pushPoints);

        if (pushPoints < 2)
            pushUpProgression = PushUpProgression.WALL_PUSH_UP;
        else if (pushPoints < 7)
            pushUpProgression = PushUpProgression.KNEE_PUSH_UP;
        else if (pushPoints < 15)
            pushUpProgression = PushUpProgression.NEGATIVE_PUSH_UP;
        else if (pushPoints < 25)
            pushUpProgression = PushUpProgression.PUSH_UP;
        else if (pushPoints < 40 && hasDipsBars)
        {
            pushUpProgression = PushUpProgression.DIP;
            this.pushPoints += 1;
        }
        else if (pushPoints < 40 && !hasDipsBars)
            pushUpProgression = PushUpProgression.PUSH_UP;
        else if (pushPoints < 70)
            pushUpProgression = PushUpProgression.ARCHER_PUSH_UP;
        else
            pushUpProgression = PushUpProgression.ONE_ARM_PUSH_UP;
    }

    @Override
    public int getLegsPoints()
    {
        return 0;
    }

    @Override
    public void setLegsPoints(int LegsPoints)
    {

    }
}
