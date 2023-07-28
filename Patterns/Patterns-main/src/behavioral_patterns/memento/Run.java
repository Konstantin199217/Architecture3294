package behavioral_patterns.memento;

public class Run {
    public static void main(String[] args) {
        Man man = new Man("Вася", 35);
        Repository repository = new Repository(man);
        System.out.println("До изменений:\n" + man);
        man.setName("Юля");
        man.setAge(-20);
        System.out.println("После изменений:\n" + man);
        man.load(repository);
        System.out.println("Восстановленный объект:\n" + man);
    }
}
