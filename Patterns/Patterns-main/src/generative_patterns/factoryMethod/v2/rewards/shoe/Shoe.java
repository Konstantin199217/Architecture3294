package generative_patterns.factoryMethod.v2.rewards.shoe;

import generative_patterns.factoryMethod.v2.classes.IGameItem;

public class Shoe implements IGameItem {
    @Override
    public void open() {
        System.out.println("Старый башмак!");
    }
}
