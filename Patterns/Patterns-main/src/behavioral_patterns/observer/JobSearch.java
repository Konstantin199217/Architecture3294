package behavioral_patterns.observer;

/**
 * Клиентский класс. Для проверки кода
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        Observer sub1 = new Subscriber("Иван");
        Observer sub2 = new Subscriber("Петр");
        Observer sub3 = new Subscriber("Сергей");

        site.addVacancy("Джуниор Java-разработчик");
        site.addVacancy("Мидл Java-разработчик");

        // Добавляем подписчиков наблюдателю
        site.addObserver(sub1);
        site.addObserver(sub2);
        site.addObserver(sub3);

        // Начинаем производить изменения, о которых оповещаются подписчики

        site.addVacancy("Синьор Java-разработчик");

        site.removeVacancy("Мидл Java-разработчик");
    }
}
