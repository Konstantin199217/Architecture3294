package behavioral_patterns.state;

import behavioral_patterns.state.staets.*;

/**
 * Клас объекта разработчик, у которого будем менять состояния
 */
public class Developer {
    private Activity activity; // Поле состояния объекта

    public Developer(Activity activity) {
        this.activity = activity;
    }

    private void setActivity(Activity activity){
        this.activity = activity;
    }

    /**
     * Метод смены состояний объекта
     */
    public void changeActivity(){
        if (activity instanceof Sleeping){
            setActivity(new Eating());
        } else if (activity instanceof Eating) {
            setActivity(new Walking());
        } else if (activity instanceof Walking) {
            setActivity(new Codding());
        } else if (activity instanceof Codding) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Sleeping());
        }
    }

    /**
     * Метод выполнения действия с заданным состоянием
     * вызывает метод doIt() у экземпляра класса активности
      */
    public void doIt(){
        activity.doIt();
    }
}
