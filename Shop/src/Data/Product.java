package Data;

public class Product {
    int Id;
    float price;
    String name;
    String description;

    public Product(int id, float price, String name, String description) {
        Id = id;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return Id;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
