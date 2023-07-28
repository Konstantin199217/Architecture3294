package behavioral_patterns.template_mathod;

/**
 * Клиентский класс
 */
public class RunWebSite {
    public static void main(String[] args) {
        WebSiteTemplate helloPage = new WelcomePage();
        WebSiteTemplate mapsPage = new MapsPage();

        helloPage.showPage();
        System.out.println("\n========================================\n");
        mapsPage.showPage();
    }
}
