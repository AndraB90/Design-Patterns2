package observer.exercitiu1;

public class User1 implements Subscriber{

    Youtube yt;

    public User1(Youtube yt) {
        this.yt = yt;
    }

    @Override
    public void update() {
       yt.getNewVideo();
    }
}
