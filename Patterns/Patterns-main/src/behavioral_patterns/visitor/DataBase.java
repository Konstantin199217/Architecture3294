package behavioral_patterns.visitor;

/**
 * Классы составляющих проекта (класс проекта, БД, тестирование)
 * имплементирующих метод интерфейса в котором прописываем логику
 * создания данной части программы полученным разработчиком
 */
public class DataBase implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
