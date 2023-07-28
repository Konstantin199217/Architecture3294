package behavioral_patterns.chain_of_responsibility.v1;

/**
 * Класс реализующий отправку "emil" при уровне приоритета 2
 */
public class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Используется класс EmailNotifier: " + message);
    }
}
