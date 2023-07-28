package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class BuffFabric extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Buff();
    }
}
