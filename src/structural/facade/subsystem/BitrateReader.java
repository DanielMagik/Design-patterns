package structural.facade.subsystem;

public class BitrateReader
{
    public static MusicFile read(MusicFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static MusicFile convert(MusicFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}