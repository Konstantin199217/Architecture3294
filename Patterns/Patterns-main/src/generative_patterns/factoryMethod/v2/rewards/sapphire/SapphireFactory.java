package generative_patterns.factoryMethod.v2.rewards.sapphire;

import generative_patterns.factoryMethod.v2.classes.IGameItem;
import generative_patterns.factoryMethod.v2.classes.ItemGenerator;

public class SapphireFactory extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}
