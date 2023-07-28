package behavioral_patterns.template_mathod;

/**
 * Абстрактный клас Веб-страницы,
 * в котором благодаря абстрактному методу переопределяется
 * содержимое контекста страницы, для разных страниц
 */
public abstract class WebSiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showContext();
        System.out.println("Footer");
    }
    public abstract void showContext();
}
