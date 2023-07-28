package structural_patterns.Proxy.v1;

/**
 * Класс для тестирования. Инициализация проекта происходит при вызове метода run()
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/user/project");
        project.run();
    }
}
