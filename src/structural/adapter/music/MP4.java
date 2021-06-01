package structural.adapter.music;

import java.util.List;

public class MP4
{
    private String name;
    private String author;
    private List<Integer> sounds;
    private MediaType mediaType;

    public MP4(String name, String author, List<Integer> sounds, MediaType mediaType)
    {
        this.name = name;
        this.author = author;
        this.sounds = sounds;
        this.mediaType = mediaType;
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public List<Integer> getSounds()
    {
        return sounds;
    }

    public MediaType getMediaType()
    {
        return mediaType;
    }
}
