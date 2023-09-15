package observer.exercitiu2;

public class AppleStore implements Store{

    @Override
    public void addCustomer(ObservableCustomer customer) {
        customers.add(customer);
    }

    @Override
    public void removeCustomer(ObservableCustomer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyCustomer() {
        for (ObservableCustomer customer: customers) {
            customer.update();
        }
    }

    public void getNewOffers(){
        System.out.println("New Apple Products!");
    }
}
