package Logics.Domen.ProductCategory;

import Logics.Domen.Product;

import java.util.List;

public class Subcategory {
    List<Product> subcategory;

    public Subcategory(List<Product> subcategory) {
        this.subcategory = subcategory;
    }

    public List<Product> getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(List<Product> subcategory) {
        this.subcategory = subcategory;
    }
}
