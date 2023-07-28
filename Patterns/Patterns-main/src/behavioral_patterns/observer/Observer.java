package behavioral_patterns.observer;

import java.util.List;

/**
 * Интерфейс подписчика.
 * Реализует метод получения оповещения (реагирования на событие)
 * от наблюдаемого.
 */
public interface Observer {
    public void handleEvent(List<String> vacations);
}
