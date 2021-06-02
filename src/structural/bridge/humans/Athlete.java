package structural.bridge.humans;

import structural.bridge.workouts.Workout;

public class Athlete implements Human
{
    protected Workout workout;

    public Athlete(Workout workout)
    {
        this.workout = workout;
    }

    @Override
    public void doPushWorkout()
    {
        workout.setPushPoints(workout.getPushPoints() + 1);
    }

    @Override
    public void doPullWorkout()
    {
        workout.setPullPoints(workout.getPullPoints() + 1);
    }

    @Override
    public void doLegsWorkout()
    {
        workout.setLegsPoints(workout.getLegsPoints() + 1);
    }

    @Override
    public void getWorkoutStatus()
    {
        workout.getPushStatus();
        workout.getPullStatus();
        workout.getLegsStatus();
        System.out.println("\n");
    }
}
