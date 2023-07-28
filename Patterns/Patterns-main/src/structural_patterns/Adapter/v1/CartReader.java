package structural_patterns.Adapter.v1;

/**
 * Класс адаптер
 */
public class CartReader implements Usb{
    private MemoryCard memoryCard; // Поле для карты памяти в адаптере

    /**
     * Конструктор класса адаптера
     * @param memoryCard карта памяти
     */
    public CartReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    /**
     * Реализуем метод интерфейса Usb для нужд карты памяти
     */
    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
