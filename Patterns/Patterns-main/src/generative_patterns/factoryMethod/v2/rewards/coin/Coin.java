package generative_patterns.factoryMethod.v2.rewards.coin;

import generative_patterns.factoryMethod.v2.classes.IGameItem;

public class Coin implements IGameItem {
    @Override
    public void open() {
        System.out.println("Монетка!");
    }
}
