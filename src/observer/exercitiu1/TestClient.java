package observer.exercitiu1;

public class TestClient {
    public static void main(String[] args) {

        Youtube youtube = new Youtube();
        User1 user1 = new User1(youtube);
        youtube.addSubscriber(user1);

        User2 user2 = new User2(youtube);
        youtube.addSubscriber(user2);

        youtube.notifySubscriber();



    }
}
