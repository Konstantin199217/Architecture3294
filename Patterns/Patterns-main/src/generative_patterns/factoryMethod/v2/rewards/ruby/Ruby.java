package generative_patterns.factoryMethod.v2.rewards.ruby;

import generative_patterns.factoryMethod.v2.classes.IGameItem;

public class Ruby implements IGameItem {
    @Override
    public void open() {
        System.out.println("Рубин!");
    }
}
