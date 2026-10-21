public class CodecFactory {
    public String extract(String metadata, String targetFormat) {
        System.out.println("CodecFactory: Extracting codec for target format: " + targetFormat);
        if (targetFormat.equalsIgnoreCase("mp4")) {
            return "H264Codec";
        } else {
            return "OggCodec";
        }
    }
}