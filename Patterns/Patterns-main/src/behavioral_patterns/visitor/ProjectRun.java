package behavioral_patterns.visitor;

/**
 * Клиентский класс. Проверяем код.
 * Один и тот же метод имеет общий скелет, но разную реализацию
 * благодаря использованию паттерна Visitor. (Применяя разных специалистов)
 */
public class ProjectRun {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Работает джун...");
        project.beWritten(junior);
        System.out.println("\n======================\n");
        System.out.println("Работает синьор...");
        project.beWritten(senior);
    }
}
