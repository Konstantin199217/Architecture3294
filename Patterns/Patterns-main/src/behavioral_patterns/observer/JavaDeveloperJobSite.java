package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс наблюдатель, оповещает подписчиков об изменениях.
 * Благодаря вызову метода notifyObservers() в методах: addVacancy() и removeVacancy()
 * при изменении списка вакансий у подписчиков будет вызываться метод handleEvent(),
 * который вызывает реакцию на событие
 */
public class JavaDeveloperJobSite implements Observed{
    private List<Observer> subscriber = new ArrayList<>();
    private List<String> vacancy = new ArrayList<>();

    /**
     * Добавление вакансии
     * @param vacancy вакансия
     */
    public void addVacancy(String vacancy){
        this.vacancy.add(vacancy);
        notifyObservers();
    }

    /**
     * Удаление вакансии
     * @param vacancy вакансия
     */
    public void removeVacancy(String vacancy){
        this.vacancy.remove(vacancy);
        notifyObservers();
    }

    /**
     * Добавление подписчика
     * @param observer подписчик
     */
    @Override
    public void addObserver(Observer observer) {
        subscriber.add(observer);
    }

    /**
     * Удаление подписчика
     * @param observer подписчик
     */
    @Override
    public void removeObserver(Observer observer) {
        subscriber.remove(observer);
    }

    /**
     * Метод оповещения подписчиков
     */
    @Override
    public void notifyObservers() {
        for (Observer o : subscriber){
            o.handleEvent(vacancy);
        }
    }
}
