package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class PetFabric extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Pet();
    }
}
