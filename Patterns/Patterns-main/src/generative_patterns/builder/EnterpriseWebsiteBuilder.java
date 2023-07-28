package generative_patterns.builder;

/**
 * Конкретный класс-строитель корпоративных сайтов
 */
public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    public void buildName() {
        website.setName("Корпоративный сайт");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(5000);
    }
}
