package structural.adapter.adapter;


import structural.adapter.music.MP3;
import structural.adapter.music.MP4;
import structural.adapter.music.MediaType;

import java.util.ArrayList;
import java.util.List;

public class MP4Adapter extends MP3
{
    private final MP4 mp4;

    public MP4Adapter(MP4 mp4)
    {
        this.mp4 = mp4;
    }

    @Override
    public String getName()
    {
        return mp4.getName() + ".mp4";
    }

    @Override
    public String getAuthor()
    {
        return mp4.getAuthor();
    }

    @Override
    public List<Byte> getSounds()
    {
        if (mp4.getMediaType() != MediaType.AUDIO)
            return new ArrayList<>();

        List<Byte> list = new ArrayList<>();

        for (Integer i : mp4.getSounds())
        {
            Byte b = Integer.valueOf(i % 128).byteValue();
            list.add(b);
        }
        return list;
    }

}
