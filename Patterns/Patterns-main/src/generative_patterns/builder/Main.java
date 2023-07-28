package generative_patterns.builder;

/**
 * Класс-клиент. Для проверки кода.
 * Получаем объект из пула, проверяем его хеш,
 * возвращаем объект в пул. Получаем объект из пула
 * в другую переменную, проверяем хеш.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);

        System.out.println("\n================================\n");

        director.setBuilder(new EnterpriseWebsiteBuilder());
        website = director.buildWebsite();
        System.out.println(website);
    }
}
