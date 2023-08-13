package Logics.Domen.ProductCategory;

import java.util.List;

public class Category {
    List<Subcategory> categories;

    public Category(List<Subcategory> categories) {
        this.categories = categories;
    }

    public List<Subcategory> getCategories() {
        return categories;
    }

    public void setCategories(List<Subcategory> categories) {
        this.categories = categories;
    }
}
