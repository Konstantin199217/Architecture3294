/*Ограничивает создание одного экземпляра класса,
обеспечивает доступ к его единственному объекту.
Конструктор класса приватный. Метод getInstance()
создает только один экземпляр класса.
*/

public class Singleton {
    /*Сделайте конструктор приватным,
    отключите расширения и создайте статическую переменную
    для хранения экземпляра:*/
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void setUp() {
        System.out.println("Test");
    }
}
