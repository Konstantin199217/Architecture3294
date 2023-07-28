package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class ArtifactFabric extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Artifact();
    }
}
