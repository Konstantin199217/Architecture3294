import Classes.ItemGenerator;
import Classes.Rewards.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ItemGenerator fab = new GoldFabric();
        fab.openReward();
        ItemGenerator fab1 = new GemFabric();
        fab1.openReward();
        ItemGenerator fab2 = new ExperienceFabric();
        fab2.openReward();
        ItemGenerator fab3 = new ArtifactFabric();
        fab3.openReward();
        ItemGenerator fab4 = new BuffFabric();
        fab4.openReward();
        ItemGenerator fab5 = new TreasureMapFabric();
        fab5.openReward();
        ItemGenerator fab6 = new PetFabric();
        fab6.openReward();

        Random rnd = ThreadLocalRandom.current();

        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab);
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);
        fabricList.add(fab6);

        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(0,6);
            fabricList.get(index).openReward();
        }
    }
}
