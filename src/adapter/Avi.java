package adapter;

public class Avi implements VideoPlayer{
    @Override
    public void playVideo() {
        System.out.println("Playing Avi video format");
    }
}
