package structural.bridge.humans;

import structural.bridge.workouts.Workout;

public class Strongman extends Athlete
{
    public Strongman(Workout workout)
    {
        super(workout);
    }

    public void injectTestosterone()
    {
        this.workout.setPushPoints(workout.getPushPoints() + 20);
        this.workout.setPullPoints(workout.getPullPoints() + 20);
        this.workout.setLegsPoints(workout.getLegsPoints() + 20);
    }
}
