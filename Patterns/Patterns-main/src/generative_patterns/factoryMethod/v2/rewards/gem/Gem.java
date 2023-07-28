package generative_patterns.factoryMethod.v2.rewards.gem;

import generative_patterns.factoryMethod.v2.classes.IGameItem;

/**
 * Класс брилианта
 */
public class Gem implements IGameItem {
    @Override
    public void open() {
        System.out.println("Брилиант!");
    }
}
