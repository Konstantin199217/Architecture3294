package behavioral_patterns.nullObject;

/**
 * Класс тигра с реализованным имплантированным методом
 */
public class Tiger implements Animal{
    @Override
    public void say() {
        System.out.println("Рррррр...");
    }
}
