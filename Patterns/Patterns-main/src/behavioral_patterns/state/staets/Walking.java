package behavioral_patterns.state.staets;

public class Walking implements Activity {
    @Override
    public void doIt() {
        System.out.println("Гуляем...");
    }
}
