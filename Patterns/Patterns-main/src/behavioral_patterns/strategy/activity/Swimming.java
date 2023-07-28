package behavioral_patterns.strategy.activity;

public class Swimming implements Activity {
    @Override
    public void doIt() {
        System.out.println("Плаваем...");
    }
}
