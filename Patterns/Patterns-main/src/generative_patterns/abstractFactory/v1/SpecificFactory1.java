package generative_patterns.abstractFactory.v1;

/**
 * Реализация абстрактной фабрики для семейства продуктов 1
 */
public class SpecificFactory1 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new SpecificProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new SpecificProductB1();
    }
}
