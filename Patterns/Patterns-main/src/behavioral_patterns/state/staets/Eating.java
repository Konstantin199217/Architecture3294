package behavioral_patterns.state.staets;

public class Eating implements Activity {
    @Override
    public void doIt() {
        System.out.println("Едим...");
    }
}
