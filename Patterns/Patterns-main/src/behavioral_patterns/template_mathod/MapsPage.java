package behavioral_patterns.template_mathod;

/**
 * Классы реализации конкретной страницы
 * с переопределением абстрактного метода
 */
public class MapsPage extends WebSiteTemplate{
    @Override
    public void showContext() {
        System.out.println("Карта мира");
    }
}
