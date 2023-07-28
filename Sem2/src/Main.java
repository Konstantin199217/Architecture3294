import Classes.ItemGenerator;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GoldFabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ItemGenerator fab = new GoldFabric();
        fab.openReward();
        ItemGenerator fab2 = new GemFabric();
        fab2.openReward();
        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab);
        fabricList.add(fab2);

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt()%2==0?0:1);
            fabricList.get(index).openReward();
        }
    }
}
