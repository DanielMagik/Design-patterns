package structural.bridge.workouts;

public interface Workout
{
    void getPushStatus();
    void getPullStatus();
    void getLegsStatus();
    int getPullPoints();
    void setPullPoints(int pullPoints);
    int getPushPoints();
    void setPushPoints(int pushPoints);
    int getLegsPoints();
    void setLegsPoints(int LegsPoints);

}
