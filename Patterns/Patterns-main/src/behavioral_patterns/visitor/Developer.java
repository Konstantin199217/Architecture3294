package behavioral_patterns.visitor;

/**
 * Общий интерфейс разработчика
 * с реализацией частей программы
 */
public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(DataBase dataBase);
    public void create(Test test);
}
