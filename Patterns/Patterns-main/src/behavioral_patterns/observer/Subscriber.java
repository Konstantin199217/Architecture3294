package behavioral_patterns.observer;

import java.util.List;

/**
 * Класс подписчиков
 */
public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    /**
     * Метод реакции на изменения в классе наблюдателя
     * @param vacations список вакансий
     */
    @Override
    public void handleEvent(List<String> vacations) {
        System.out.println("Уважаемый " + name + " у нас  изменились вакансии:\n" + vacations + "\n\n");
    }
}
