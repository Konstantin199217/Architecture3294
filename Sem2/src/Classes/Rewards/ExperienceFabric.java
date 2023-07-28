package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class ExperienceFabric extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Experience();
    }
}
