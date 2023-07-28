package behavioral_patterns.strategy;

import behavioral_patterns.strategy.activity.Driving;
import behavioral_patterns.strategy.activity.Running;
import behavioral_patterns.strategy.activity.Swimming;

/**
 * Класс клиента. Стратегия очень похожа на состояние,
 * но управление поведением в отличие от Состояния происходит
 * в клиентском коде, а не в классе объекта.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setActivity(new Swimming());
        person.doSomething();

        person.setActivity(new Driving());
        person.doSomething();

        person.setActivity(new Running());
        person.doSomething();
    }
}
