package adapter;

public class MediaFormatAdapter implements MediaPlayer{

    VideoPlayer videoPlayer;

    public MediaFormatAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play() {
        videoPlayer.playVideo();
    }
}
