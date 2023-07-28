package behavioral_patterns.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Переписываем класс за джуном...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Поднимаем базу данных...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Правим тесты...");
    }
}
