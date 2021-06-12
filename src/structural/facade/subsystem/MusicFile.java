package structural.facade.subsystem;

public class MusicFile
{
    private String name;
    private String codecType;

    public MusicFile(String name)
    {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getName()
    {
        return name;
    }

    public String getCodecType()
    {
        return codecType;
    }
}
