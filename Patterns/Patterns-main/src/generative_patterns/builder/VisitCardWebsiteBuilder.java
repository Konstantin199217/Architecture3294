package generative_patterns.builder;

/**
 * Конкретный класс-строитель сайтов визиток
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    public void buildName() {
        website.setName("Сайт визитка");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        website.setPrice(1000);
    }
}
