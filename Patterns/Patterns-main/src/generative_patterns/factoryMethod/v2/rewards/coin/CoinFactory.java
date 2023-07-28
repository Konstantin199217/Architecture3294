package generative_patterns.factoryMethod.v2.rewards.coin;

import generative_patterns.factoryMethod.v2.classes.IGameItem;
import generative_patterns.factoryMethod.v2.classes.ItemGenerator;

public class CoinFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Coin();
    }
}
