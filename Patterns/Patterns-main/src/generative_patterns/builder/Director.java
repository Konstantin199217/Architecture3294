package generative_patterns.builder;

/**
 * Класс осуществляющий сборку объекта
 */
public class Director {
    WebsiteBuilder builder; // поле-ссылка на абстрактный класс-строитель

    /**
     * Метод подготовки сборщика в зависимости от конкретного строителя
     * @param builder конкретный строитель сайта
     */
    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    /**
     * Метод сборки сайта
     * @return готовый сайт
     */
    public Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();
        return builder.getWebsite();
    }
}
