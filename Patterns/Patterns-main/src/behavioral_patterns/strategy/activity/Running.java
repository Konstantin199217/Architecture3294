package behavioral_patterns.strategy.activity;

public class Running implements Activity{
    @Override
    public void doIt() {
        System.out.println("Бегаем...");
    }
}
