package behavioral_patterns.chain_of_responsibility.v1;

/**
 * Класс уведомитель
 */
public abstract class Notifier {
    private int priority; // Приоритет уведомления
    private Notifier nextNotifier; // Следующий уведомитель

    /**
     * Конструктор уведомителя
     * @param priority уровень приоритета
     */
    public Notifier(int priority) {
        this.priority = priority;
    }

    /**
     * Метод для назначения следующего уведомителя
     * @param nextNotifier следующий уведомитель
     */
    public void setNextNotifier(Notifier nextNotifier){
        this.nextNotifier = nextNotifier;
    }

    /**
     * Метод, который сравнивает передаваемый приоритет в методе
     * с уровнем приоритета класса.
     * Если уровень приоритета в методе больше и равен приоритету класса, то вызывается метод write.
     * Иначе передается следующему классу в цепочке.
     * @param message сообщение
     * @param level уровень приоритета
     */
    public void notifyManager(String message, int level){
        if (level >= priority){
            write(message);
        }
        if (nextNotifier != null){
            nextNotifier.notifyManager(message, level);
        }
    }

    /**
     * Абстрактный метод реализуемый в классах наследниках
     * осуществляет логику на своем уровне приоритета
     * @param message сообщение
     */
    public abstract void write(String message);
}
