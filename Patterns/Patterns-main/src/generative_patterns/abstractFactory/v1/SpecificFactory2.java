package generative_patterns.abstractFactory.v1;

/**
 * Реализация абстрактной фабрики для продуктов семейства 2
 */
public class SpecificFactory2 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new SpecificProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new SpecificProductB2();
    }
}
