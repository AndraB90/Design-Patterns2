package observer.exercitiu2;

import java.util.ArrayList;

public interface Store {

    ArrayList<ObservableCustomer>customers = new ArrayList<>();
    void addCustomer(ObservableCustomer customer);
    void removeCustomer(ObservableCustomer customer);
    void notifyCustomer();
}
