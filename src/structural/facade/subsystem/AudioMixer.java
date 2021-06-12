package structural.facade.subsystem;

import java.io.File;

public class AudioMixer
{
    public File fix(MusicFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
