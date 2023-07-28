package behavioral_patterns.state.staets;

public class Sleeping implements Activity {
    @Override
    public void doIt() {
        System.out.println("Спим...");
    }
}
