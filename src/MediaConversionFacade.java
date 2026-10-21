import java.io.File;

public class MediaConversionFacade {
    private MetadataReader metadataReader;
    private CodecFactory codecFactory;
    private BitrateReader bitrateReader;
    private AudioMixer audioMixer;

    public MediaConversionFacade() {
        this.metadataReader = new MetadataReader();
        this.codecFactory = new CodecFactory();
        this.bitrateReader = new BitrateReader();
        this.audioMixer = new AudioMixer();
    }

    public File convertVideo(String fileName, String targetFormat) {
        System.out.println("---> Facade: Conversion process started for: " + fileName + " to " + targetFormat + " <---");

        String metadata = metadataReader.read(fileName);
        String codec = codecFactory.extract(metadata, targetFormat);
        String bufferedData = bitrateReader.read(fileName, codec);
        File resultFile = audioMixer.fix(bufferedData, targetFormat);

        System.out.println("---> Facade: Conversion completed successfully! <---");
        return resultFile;
    }
}