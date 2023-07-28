package generative_patterns.factoryMethod.v2.rewards.ruby;

import generative_patterns.factoryMethod.v2.classes.IGameItem;
import generative_patterns.factoryMethod.v2.classes.ItemGenerator;

public class RubyFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}
