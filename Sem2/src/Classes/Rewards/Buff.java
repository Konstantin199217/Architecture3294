package Classes.Rewards;

import Classes.iGameItem;

public class Buff implements iGameItem {
    @Override
    public void open() {
        System.out.println("BUFF");
    }
}
