package observer.exercitiu2;

public class TestClient {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();
        SamsungStore samsungStore = new SamsungStore();

        Customer1 customer1 = new Customer1(appleStore);
        appleStore.addCustomer(customer1);

        Customer2 customer2 = new Customer2(samsungStore);
        samsungStore.addCustomer(customer2);

        appleStore.notifyCustomer();
        samsungStore.notifyCustomer();


    }
}
