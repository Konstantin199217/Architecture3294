package Performance;

import Data.Product;
import Logic.BuyOrder;
import Logic.Delivery;
import Logic.Order;

public interface IButton {
    Product find(Product product);
    Order addProduct(Product product);
    Delivery setDelivery(String address, Order order);
    BuyOrder payOrder(Order order, int card);

}
