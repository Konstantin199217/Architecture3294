package Logics.Domen;

import Logics.Domen.ProductCategory.Category;
import Logics.Domen.ProductCategory.Subcategory;
import Logics.Domen.ProductCategory.Type;

import java.util.Date;

public class Product {
    Provider provider;
    Category category;
    Subcategory subcategory;
    Type type;
    String name;
    float price;
    int count;
    Date dateManufacture;

    public Product(Provider provider, Category category, Subcategory subcategory,
                   Type type, String name, float price, int count, Date dateManufacture) {
        this.provider = provider;
        this.category = category;
        this.subcategory = subcategory;
        this.type = type;
        this.name = name;
        this.price = price;
        this.count = count;
        this.dateManufacture = dateManufacture;
    }

    public Provider getProvider() {
        return provider;
    }

    public Category getCategory() {
        return category;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public Date getDateManufacture() {
        return dateManufacture;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDateManufacture(Date dateManufacture) {
        this.dateManufacture = dateManufacture;
    }
}
