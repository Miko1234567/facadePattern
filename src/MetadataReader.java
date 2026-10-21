public class MetadataReader {
    public String read(String fileName) {
        System.out.println("MetadataReader: Reading file metadata for " + fileName + "...");
        return "Metadata[" + fileName + "]";
    }
}