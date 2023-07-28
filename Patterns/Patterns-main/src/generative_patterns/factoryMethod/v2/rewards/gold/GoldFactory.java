package generative_patterns.factoryMethod.v2.rewards.gold;

import generative_patterns.factoryMethod.v2.classes.IGameItem;
import generative_patterns.factoryMethod.v2.classes.ItemGenerator;

/**
 * Фабрика создания золота
 */
public class GoldFactory extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
