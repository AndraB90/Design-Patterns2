package observer.exercitiu2;

public class Customer2 implements ObservableCustomer{

    SamsungStore samsungStore;

    public Customer2( SamsungStore samsungStore) {
        this.samsungStore = samsungStore;
    }

    @Override
    public void update() {
        samsungStore.getNewOffers();
    }
}
