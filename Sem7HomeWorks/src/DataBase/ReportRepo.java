package DataBase;

import Data.DataBase;
import Logics.Domen.Order;
import Logics.Domen.Product;
import Logics.Interface.IRepo;

import java.util.List;
import java.util.Objects;

public class ReportRepo implements IRepo {
    DataBase DataRepo;
    List<Product> products;
    Data.DataBase inst;
    List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    static Data.DataBase getInstance() {
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }


    @Override
    public Objects getRepo() {
        return null;
    }

    @Override
    public IRepo getOrder() {
        return null;
    }
}
