package structural_patterns.Adapter.v1;

/**
 * Класс проверки,
 */
public class Main {
    public static void main(String[] args) {
        Usb cardReader = new CartReader(new MemoryCard());
        cardReader.connectWithUsbCable();
    }
}
