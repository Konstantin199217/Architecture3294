package structural_patterns.Adapter.v1;

/**
 * Класс карты памяти
 */
public class MemoryCard {
    public void insert(){
        System.out.println("Карта памяти вставлена...");
    }
    public void copyData(){
        System.out.println("Данные скопированы...");
    }
}
