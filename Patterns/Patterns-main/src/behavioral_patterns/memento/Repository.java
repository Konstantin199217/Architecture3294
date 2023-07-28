package behavioral_patterns.memento;

/**
 * Хранилище версий объекта
 */
public class Repository {
    private final String name;
    private final int age;

    public Repository(Man man) {
        this.name = man.getName();
        this.age = man.getAge();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
