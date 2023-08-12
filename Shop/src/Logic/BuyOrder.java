package Logic;

import Data.Product;
import Logic.Interface.PaymentCard;
import Logic.Interface.PaymentCash;

public class BuyOrder implements PaymentCard, PaymentCash {

    @Override
    public PaymentCard pay(Order order, int card) {
        return null;
    }

    @Override
    public PaymentCash payCash(Order order) {
        return null;
    }

}
