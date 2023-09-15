package observer.exercitiu1;

public class Youtube implements SocialMedia{
    @Override
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber s:subscribers) {
            s.update();
        }
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    public void getNewVideo(){
        System.out.println("New video is streaming...");
    }
}
