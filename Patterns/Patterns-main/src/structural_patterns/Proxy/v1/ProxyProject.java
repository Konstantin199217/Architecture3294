package structural_patterns.Proxy.v1;

/**
 * Класс Proxy, котрый принимает вызовы объекта RealProject
 * и провидет его инициализацию (в т.ч. загрузку проекта с GitHub)
 * только при вызове метода run(), таким образовм организована ленивая инициализация
 */
public class ProxyProject implements Project{

    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(realProject == null){
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
