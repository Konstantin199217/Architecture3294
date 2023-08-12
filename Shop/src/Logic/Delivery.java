package Logic;

import Data.Product;

import java.util.List;

public class Delivery {

    String address;
    int IdOrder;

    public Delivery(String address, int idOrder) {
        this.address = address;
        IdOrder = idOrder;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setIdOrder(int idOrder) {
        IdOrder = idOrder;
    }
}
