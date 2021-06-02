package structural.adapter.music;

import java.util.*;

public class MP3
{
    private String name;
    private String author;
    private final List<Byte> sounds;

    public MP3()
    {
        this.sounds = new ArrayList<>();
    }

    public MP3(String name, String author, List<Byte> sounds)
    {
        this.name = name;
        this.author = author;
        this.sounds = sounds;
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public List<Byte> getSounds()
    {
        return sounds;
    }
}
