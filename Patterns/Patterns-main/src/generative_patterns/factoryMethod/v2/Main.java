package generative_patterns.factoryMethod.v2;

import generative_patterns.factoryMethod.v2.classes.ItemGenerator;
import generative_patterns.factoryMethod.v2.rewards.coin.CoinFactory;
import generative_patterns.factoryMethod.v2.rewards.gem.GemFactory;
import generative_patterns.factoryMethod.v2.rewards.gold.GoldFactory;
import generative_patterns.factoryMethod.v2.rewards.ruby.RubyFactory;
import generative_patterns.factoryMethod.v2.rewards.sapphire.SapphireFactory;
import generative_patterns.factoryMethod.v2.rewards.shoe.ShoeFactory;
import generative_patterns.factoryMethod.v2.rewards.silver.SilverFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Точка входа в программу
 */
public class Main {
    public static void main(String[] args) {
        ItemGenerator goldFactory = new GoldFactory();
        ItemGenerator gemFactory = new GemFactory();
        ItemGenerator coinFactory = new CoinFactory();
        ItemGenerator silverFactory = new SilverFactory();
        ItemGenerator rubyFactory = new RubyFactory();
        ItemGenerator sapphireFactory = new SapphireFactory();
        ItemGenerator shoeFactory = new ShoeFactory();


        List<ItemGenerator> fabricList = new ArrayList<>(
                Arrays.asList(goldFactory,
                        gemFactory,
                        coinFactory,
                        silverFactory,
                        rubyFactory,
                        sapphireFactory,
                        shoeFactory));

        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}

