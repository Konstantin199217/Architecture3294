package behavioral_patterns.strategy.activity;

/**
 * Реализация поведения при различных состояниях
 */
public class Driving implements Activity{
    @Override
    public void doIt() {
        System.out.println("Едем на машине...");
    }
}
