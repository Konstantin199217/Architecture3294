package Logic;

import Data.Product;
import Logic.Interface.FindProduct;

public class FindProductName implements FindProduct {
    @Override
    public Product Find(Product product) {
        return product;
    }
}
