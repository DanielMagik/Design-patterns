package structural.adapter.players;

import structural.adapter.music.MP3;

public class MP3Player
{
    private String firm;

    public MP3Player(String firm)
    {
        this.firm = firm;
    }

    public void play(MP3 song)
    {
        System.out.println("Playing song "+song.getName()+" created by "+song.getAuthor());
        for(Byte b : song.getSounds())
        {
            System.out.print(b+" ");
        }
        System.out.println("\n");
    }
}
