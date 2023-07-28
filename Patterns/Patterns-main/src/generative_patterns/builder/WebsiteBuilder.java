package generative_patterns.builder;

/**
 * Абстрактный класс строитель реализующий общие методы для
 * конкретных классов строителей и определяющий методы, которые
 * будут переопределены в них
 */
public abstract class WebsiteBuilder {
    Website website; // Поле с обобщенным каркасом сайтов

    public void createWebsite(){
        website = new Website();
    }

    public abstract void buildName();
    public abstract void buildCms();
    public abstract void buildPrice();

    public Website getWebsite(){
        return website;
    }
}
