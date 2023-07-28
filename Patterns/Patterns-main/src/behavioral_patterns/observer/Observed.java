package behavioral_patterns.observer;

/**
 * Интерфейс наблюдаемого.
 * Реализует методы добавления подписчиков, их удаления
 * и оповещения об изменении состояния.
 */
public interface Observed {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
