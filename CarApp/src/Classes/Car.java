package Classes;

import java.awt.*;

public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuel;
    private TypeGearbox gearbox;
    private float engineCap;


    public Car(String make,
               String model,
               Color color,
               TypeCar bodyType,
               int numberWheels,
               TypeFuel fuel,
               TypeGearbox gearbox,
               float engineCap) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.engineCap = engineCap;
    }

    public void movement() {
    }

    public void maintenance() {
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }

    public void setGearbox(TypeGearbox gearbox) {
        this.gearbox = gearbox;
    }

    public void setEngineCap(float engineCap) {
        this.engineCap = engineCap;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public TypeGearbox getGearbox() {
        return gearbox;
    }

    public float getEngineCap() {
        return engineCap;
    }

    public abstract int gearShift(int gear);

    public boolean turnLight() {
        return true;
    }

    public boolean trnWprs() {
        return true;
    }
}
