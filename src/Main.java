import java.io.File;

public class Main {
    public static void main(String[] args) {
        MediaConversionFacade conversionFacade = new MediaConversionFacade();
        File finalVideo = conversionFacade.convertVideo("my_holiday_video.ogg", "MP4");
        System.out.println("Result: Ready file -> " + finalVideo.getName());
    }
}