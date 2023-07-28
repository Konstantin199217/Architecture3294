package behavioral_patterns.strategy;

import behavioral_patterns.strategy.activity.Activity;

/**
 * Класс объекта
 */
public class Person {
    private Activity activity;

    /**
     * Метод смены состояния
     * @param activity состояние
     */
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * Метод выполнения действия при определенном состоянии
     */
    public void doSomething(){
        activity.doIt();
    }
}
