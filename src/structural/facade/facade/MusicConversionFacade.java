package structural.facade.facade;

import structural.facade.subsystem.*;

import java.io.File;

public class MusicConversionFacade
{
    public File convertMusic(String fileName, String format)
    {
        System.out.println("MusicConversionFacade: conversion started.");
        MusicFile file = new MusicFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4"))
        {
            destinationCodec = new Mp4CompressionCodec();
        } else
        {
            destinationCodec = new Mp3CompressionCodec();
        }
        MusicFile buffer = BitrateReader.read(file, sourceCodec);
        MusicFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("MusicFacade: conversion completed.");
        return result;
    }
}
