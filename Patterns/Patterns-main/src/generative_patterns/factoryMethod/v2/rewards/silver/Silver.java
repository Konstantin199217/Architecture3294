package generative_patterns.factoryMethod.v2.rewards.silver;

import generative_patterns.factoryMethod.v2.classes.IGameItem;

public class Silver implements IGameItem {
    @Override
    public void open() {
        System.out.println("Серебро!");
    }
}
