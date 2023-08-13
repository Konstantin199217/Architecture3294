package Logics.Domen;

public class Provider {
    String name;
    Address address;
    String email;
    int phone;

    public Provider(String name, Address address, String email, int phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }
}
