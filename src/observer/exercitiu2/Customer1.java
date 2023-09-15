package observer.exercitiu2;

public class Customer1 implements ObservableCustomer{
    AppleStore appleStore;

    public Customer1(AppleStore appleStore) {
        this.appleStore = appleStore;
    }
    @Override
    public void update() {
        appleStore.getNewOffers();
    }
}
