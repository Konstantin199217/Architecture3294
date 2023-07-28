package behavioral_patterns.command.v1.base;

/**
 * Класс имитирующий БД с методами вставки, изменения, чтения и удаления
 */
public class DataBase {
    public void insert(){
        System.out.println("Вставка в БД...");
    }
    public void update(){
        System.out.println("Обновление в БД...");
    }
    public void select(){
        System.out.println("Получение из БД...");
    }
    public void delete(){
        System.out.println("Удаление в БД...");
    }
}
