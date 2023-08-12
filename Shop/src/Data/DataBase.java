package Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataBase {
    List<Product> products;
    DataBase inst;

    static DataBase getInstance() {
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
}
