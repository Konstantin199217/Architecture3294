package structural_patterns.Decorator.v1;

/**
 * Стандартный мотоцикл, который будет подвергаться изменениям
 */
public class StandardBike implements Bike{
    private final int SPEED;
    private final int WEIGHT;

    public StandardBike() {
        this.SPEED = 60;
        this.WEIGHT = 350;
    }

    @Override
    public int getSpeed() {
        return this.SPEED;
    }

    @Override
    public int getWeight() {
        return this.WEIGHT;
    }
}
