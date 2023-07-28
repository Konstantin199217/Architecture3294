package Classes.Rewards;

import Classes.iGameItem;

public class Pet implements iGameItem {
    @Override
    public void open() {
        System.out.println("Unicorn");
    }
}
