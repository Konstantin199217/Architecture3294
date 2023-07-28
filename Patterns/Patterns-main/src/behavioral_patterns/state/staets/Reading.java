package behavioral_patterns.state.staets;

public class Reading implements Activity {
    @Override
    public void doIt() {
        System.out.println("Читаем...");
    }
}
