package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class TreasureMapFabric extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Treasure_map();
    }
}
