package Logic.Interface;

import Data.Product;
import Logic.Order;

public interface PaymentCard {
    PaymentCard pay(Order order, int card);
}
