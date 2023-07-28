package structural_patterns.Proxy.v1;

/**
 * Класс реального объекта проекта
 */
public class RealProject implements Project{
    private String url;

    /**
     * Конструктор класса, в котором происходит загрзка проекта из репозитория GitHub
     * при создании объекта
     * @param url адрес репозитория
     */
    public RealProject(String url) {
        this.url = url;
        loadProject(url);
    }

    public void loadProject(String url){
        System.out.println("Загрузка проекта...");
    }

    @Override
    public void run() {
        System.out.println("Запуск проекта ...");
    }
}
