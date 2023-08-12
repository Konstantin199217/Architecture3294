package Logic;

import Data.Product;

import java.util.List;

public class Order {
    List<Product> order;
    int IdOrder;
    long priceOrder;

    public void setPriceOrder(long priceOrder) {
        this.priceOrder = priceOrder;
    }

    public long getPriceOrder() {
        return priceOrder;
    }

    public int getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(int idOrder) {
        IdOrder = idOrder;
    }

    public void addProductOrder(Product product){}
}
