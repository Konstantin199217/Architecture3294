package generative_patterns.factoryMethod.v2.rewards.gold;

import generative_patterns.factoryMethod.v2.classes.IGameItem;

/**
 * Класс золота
 */
public class Gold implements IGameItem {

    @Override
    public void open() {
        System.out.println("Золото!");
    }
}
