package observer.exercitiu1;

import java.util.ArrayList;

public interface SocialMedia {
    ArrayList<Subscriber>subscribers = new ArrayList<>();
    void addSubscriber(Subscriber s);
    void notifySubscriber();
    void removeSubscriber(Subscriber s);
}
