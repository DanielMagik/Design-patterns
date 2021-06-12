package structural.facade.subsystem;

public class CodecFactory {
    public static Codec extract(MusicFile file)
    {
        String type = file.getCodecType();
        if (type.equals("mp4"))
        {
            System.out.println("CodecFactory: extracting mp4 audio...");
            return new Mp3CompressionCodec();
        }
        else
        {
            System.out.println("CodecFactory: extracting mp3 audio...");
            return new Mp4CompressionCodec();
        }
    }
}