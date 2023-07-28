package generative_patterns.prototype;

/**
 * Клиентский класс. Проверяем код.
 */
public class Main {
    public static void main(String[] args) {
        Project project = new Project(1, "project", "полезный код");
        System.out.printf("Проект хеш - %d, id - %d, имя - %s, source - %s\n\n",
                project.hashCode(), project.getId(), project.getProjectName(), project.getSourceCode());
        // Первый способ копирования объекта
        Project projectCopy = (Project) project.copy();
        System.out.printf("Проект хеш - %d, id - %d, имя - %s, source - %s\n\n",
                projectCopy.hashCode(), projectCopy.getId(), projectCopy.getProjectName(), projectCopy.getSourceCode());
        // Второй способ копирования
        ProjectFactory factory = new ProjectFactory(project);
        Project projectCopy2 = factory.cloneProject();
        System.out.printf("Проект хеш - %d, id - %d, имя - %s, source - %s\n\n",
                projectCopy2.hashCode(), projectCopy2.getId(), projectCopy2.getProjectName(), projectCopy2.getSourceCode());

    }
}
