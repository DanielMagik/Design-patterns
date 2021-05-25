package creational.builder.components;

public class SwimmingPool implements PrintInfoAble
{
    private int depth;
    private int length;
    private int width;
    private boolean hasWater;

    public SwimmingPool(int depth, int length, int width, boolean hasWater)
    {
        this.depth = depth;
        this.length = length;
        this.width = width;
        this.hasWater = hasWater;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Sizes of swimming pool are:");
        System.out.println("length: " + length + ",");
        System.out.println("width: " + width + ",");
        System.out.println("depth: " + depth + ".");
        if(hasWater)
            System.out.println("There is water inside.");
        else
            System.out.println("Swimming pool is empty.");
    }
}
