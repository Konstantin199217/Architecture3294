package behavioral_patterns.chain_of_responsibility.v1;

/**
 * Класс клиент, для проверки реализации вызовов по цепочке
 */
public class BugTracker {
    public static void main(String[] args) {
        // Создаем объекты уведомителей
        Notifier report = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SMSNotifier(Priority.ASAP);

        // Назначаем цепочку уведомителей
        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        // Проверяем передачу сообщений по цепочке
        report.notifyManager("Все хорошо", 1);
        System.out.println("=============================");
        report.notifyManager("Есть проблемы", 2);
        System.out.println("=============================");
        report.notifyManager("Все пропало", 3);
    }
}
