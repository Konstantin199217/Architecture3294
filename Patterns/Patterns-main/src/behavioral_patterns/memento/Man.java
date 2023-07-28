package behavioral_patterns.memento;

/**
 * Класс, который будет подвергаться изменениям
 */
public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void load(Repository repository){
        this.name = repository.getName();
        this.age = repository.getAge();
    }

    @Override
    public String toString() {
        return String.format("Мужчина: %s, возраст - %d", this.name, this.age);
    }
}
