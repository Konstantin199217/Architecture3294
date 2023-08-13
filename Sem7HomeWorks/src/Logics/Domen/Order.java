package Logics.Domen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    List<Product> products;
    Customer customer;
    boolean status;
    Date dateOrder;
    private List OrderAddProduct(Product product){
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        return productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", customer=" + customer +
                ", status=" + status +
                ", dateOrder=" + dateOrder +
                '}';
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getDateOrder() {
        return dateOrder;
    }
}
