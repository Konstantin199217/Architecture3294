package generative_patterns.factoryMethod.v2.rewards.sapphire;

import generative_patterns.factoryMethod.v2.classes.IGameItem;

public class Sapphire implements IGameItem {
    @Override
    public void open() {
        System.out.println("Сапфир!");
    }
}
