package generative_patterns.factoryMethod.v2.rewards.shoe;

import generative_patterns.factoryMethod.v2.classes.IGameItem;
import generative_patterns.factoryMethod.v2.classes.ItemGenerator;

public class ShoeFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Shoe();
    }
}
