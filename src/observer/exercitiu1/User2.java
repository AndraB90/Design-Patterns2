package observer.exercitiu1;

public class User2 implements Subscriber{
    Youtube yt;

    public User2(Youtube yt) {
        this.yt = yt;
    }

    @Override
    public void update() {
        yt.getNewVideo();
    }
}
