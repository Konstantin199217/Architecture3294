package Classes;

import java.awt.*;

public class Pickup extends  Car implements iRefueling {
    private int loadСapacity;

    public Pickup(String make,
                  String model,
                  Color color,
                  TypeCar bodyType,
                  int numberWheels,
                  TypeFuel fuel,
                  TypeGearbox gearbox,
                  float engineCap, int loadСapacity) {
        super(make,
                model,
                color,
                bodyType,
                numberWheels,
                fuel,
                gearbox,
                engineCap);
        this.loadСapacity = loadСapacity;
    }
    public void setLoadСapacity(int loadСapacity) {
        this.loadСapacity = loadСapacity;
    }

    public int getLoadСapacity() {
        return loadСapacity;
    }

    @Override
    public int gearShift(int gear) {
        return 0;
    }

    @Override
    public void fuel() {
        System.out.println("Full");
    }
}
