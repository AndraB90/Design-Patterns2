package adapter;

public class Mkv implements VideoPlayer{
    @Override
    public void playVideo() {
        System.out.println("Playing Mkv video format");
    }
}
