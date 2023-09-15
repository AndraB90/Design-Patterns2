package adapter;

public class Wav implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Playing Wav music format");
    }
}
