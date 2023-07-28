package behavioral_patterns.state;

import behavioral_patterns.state.Developer;
import behavioral_patterns.state.staets.Activity;
import behavioral_patterns.state.staets.Sleeping;

/**
 * Класс клиент. Для проверки кода
 * В цикле Фор 10 раз меняем состояние объекта Разработчик
 */
public class Main {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer(activity);

        for (int i=0; i < 10; i++){
            developer.doIt();
            developer.changeActivity();
        }
    }
}
