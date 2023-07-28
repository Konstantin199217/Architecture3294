package generative_patterns.factoryMethod.v2.rewards.gem;

import generative_patterns.factoryMethod.v2.classes.IGameItem;
import generative_patterns.factoryMethod.v2.classes.ItemGenerator;

/**
 * Фабрика создания брилиантов
 */
public class GemFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
