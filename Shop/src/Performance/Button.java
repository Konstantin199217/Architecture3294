package Performance;

import Data.Product;
import Logic.BuyOrder;
import Logic.Delivery;
import Logic.FindProductName;
import Logic.Order;

public class Button implements IButton{
    @Override
    public Product find(Product product) {
        FindProductName findProduct = new FindProductName();
        findProduct.Find(product);
        return product;
    }

    public Order addProduct(Product product) {
        Order order = new Order();
        order.addProductOrder(product);
        return order;
    }

    public Delivery setDelivery(String address, Order order) {
        Delivery delivery = new Delivery(address, order.getIdOrder());
        return delivery;
    }

    public BuyOrder payOrder(Order order, int card) {
        BuyOrder buyOrder = new BuyOrder();
        buyOrder.pay(order,card);
        return buyOrder;
    }
}
