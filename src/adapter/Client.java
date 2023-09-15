package adapter;

public class Client {
    public static void main(String[] args) {
        Mp3 mp3 = new Mp3();
        Wav wav = new Wav();
        Mkv mkv = new Mkv();
        Avi avi = new Avi();

        mp3.play();
        wav.play();

        MediaFormatAdapter mediaFormatAdapter = new MediaFormatAdapter(mkv);
        mediaFormatAdapter.play();
        MediaFormatAdapter mediaFormatAdapter1 = new MediaFormatAdapter(avi);
        mediaFormatAdapter1.play();
    }
}
