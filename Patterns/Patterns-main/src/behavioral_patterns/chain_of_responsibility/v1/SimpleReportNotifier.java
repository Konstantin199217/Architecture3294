package behavioral_patterns.chain_of_responsibility.v1;

/**
 * Класс реализующий отправку "отчета" при уровне приоритета 1
 */
public class SimpleReportNotifier extends Notifier{
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Используется класс SimpleReportNotifier: " + message);
    }
}
