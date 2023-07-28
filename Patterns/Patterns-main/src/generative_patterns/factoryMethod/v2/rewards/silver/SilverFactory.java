package generative_patterns.factoryMethod.v2.rewards.silver;

import generative_patterns.factoryMethod.v2.classes.IGameItem;
import generative_patterns.factoryMethod.v2.classes.ItemGenerator;

public class SilverFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
