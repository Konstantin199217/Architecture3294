package structural_patterns.Decorator.v1;

public class Main {
    public static void main(String[] args) {
        StandardBike standardBike = new StandardBike();
        System.out.printf("Стандартный мотоцикл: скорость - %d, вес - %d\n", standardBike.getSpeed(), standardBike.getWeight());
        SportBike sportBike = new SportBike(standardBike);
        System.out.printf("Гоночный мотоцикл: скорость - %d, вес - %d\n", sportBike.getSpeed(), sportBike.getWeight());
    }
}
