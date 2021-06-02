package structural.adapter.music;

import java.util.List;

public class MP4
{
    private final String name;
    private final String author;
    private final List<Integer> sounds;
    private final MediaType mediaType;

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
