package behavioral_patterns.chain_of_responsibility.v1;

/**
 * Класс реализующий отправку "СМС" при уровне приоритета 3
 */
public class SMSNotifier extends Notifier{
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Используется класс SMSNotifier: " + message);
    }
}
