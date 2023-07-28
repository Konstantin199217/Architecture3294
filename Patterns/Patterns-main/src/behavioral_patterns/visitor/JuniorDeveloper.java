package behavioral_patterns.visitor;

/**
 * Классы конкретного разработчика (джуна и синьора)
 * имеют общие скелеты методов, но разную реализацию.
 */
public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Пишем плохой класс программы...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Ложим базу данных...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Запарываем тесты....");
    }
}
