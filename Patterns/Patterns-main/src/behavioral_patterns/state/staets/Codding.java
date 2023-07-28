package behavioral_patterns.state.staets;

/**
 * Классы реализации состояний объекта
 */
public class Codding implements Activity {
    @Override
    public void doIt() {
        System.out.println("Бешено пишем код...");
    }
}
