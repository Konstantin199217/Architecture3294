package structural_patterns.Decorator.v1;

/**
 * Класс выступающий в роли декоратора принимает объект StandardBike
 * и изменяющий его свойства
 */
public class SportBike implements Bike{

    private StandardBike standardBike;

    public SportBike(StandardBike standardBike) {
        this.standardBike = standardBike;
    }

    @Override
    public int getSpeed() {
        return standardBike.getSpeed() + 40;
    }

    @Override
    public int getWeight() {
        return standardBike.getWeight() - 100;
    }
}
