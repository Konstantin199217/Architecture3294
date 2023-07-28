package generative_patterns.factoryMethod.v2.classes;

/**
 * Абстрактная фабрика создания наград
 */
public abstract class ItemGenerator {
    public void openReward(){
        IGameItem gameItem = createItem();
        gameItem.open();
    }
    public abstract IGameItem createItem();
}
