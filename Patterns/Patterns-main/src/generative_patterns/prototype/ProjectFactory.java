package generative_patterns.prototype;

/**
 * Фабрика копирования объектов
 */
public class ProjectFactory {
    Project project; // Поле-ссылка на класс Проекта

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * Метод копирования объектов
     * @return объект
     */
    public Project cloneProject(){
        return (Project) project.copy();
    }
}
