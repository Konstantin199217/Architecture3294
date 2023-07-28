package generative_patterns.factoryMethod.v1;

public class CatFactory {
    /**
     * Метод принимающий enum-переменную и на основе ее
     * блоке switch-case создаем экземляр класса.
     * @param type
     * @return
     */
    public Cat createCat(CatType type){
        Cat cat = null;

        switch (type){
            case LION -> cat = new Lion();
            case TIGER -> cat = new Tiger();
            case BARSIK -> cat = new Barsik();
        }
        return cat;
    }
}
