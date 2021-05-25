package creational.builder.components.enums;

public enum Color
{
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,255,0),
    BLACK(0,0,0),
    WHITE(255,255,255),
    YELLOW(255,255,0),
    PURPLE(255,0,255),
    TURQUOISE(0,255,255),
    GRAY(128,128,128);

    private short red;
    private short green;
    private short blue;

    Color(int red, int green, int blue)
    {
        this.red = (short)red;
        this.green = (short) green;
        this.blue = (short) blue;
    }

}
