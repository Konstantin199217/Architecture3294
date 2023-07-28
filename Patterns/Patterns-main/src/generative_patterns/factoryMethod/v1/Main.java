package generative_patterns.factoryMethod.v1;

public class Main {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Cat cat1 = catFactory.createCat(CatType.BARSIK);
        Cat cat2 = catFactory.createCat(CatType.LION);
        Cat cat3 = catFactory.createCat(CatType.TIGER);
        cat1.setName("Барсик");
        cat2.setName("Лев");
        cat3.setName("Тигр");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
    }
}
