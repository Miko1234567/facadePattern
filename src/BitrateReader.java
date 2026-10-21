public class BitrateReader {
    public String read(String fileName, String codec) {
        System.out.println("BitrateReader: Reading bitrate and buffering file with codec " + codec + "...");
        return "BufferedBytes[" + fileName + "]";
    }
}