package behavioral_patterns.visitor;

/**
 * Класс всего проекта, который объединяет в себе
 * части проекта
 */
public class Project implements ProjectElement{
    ProjectElement [] projectElements; // Массив элементов проекта

    /**
     * В конструкторе помещаем все части проекта в общий массив
     */
    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    /**
     * Метод написания всего проекта, методом перебора
     * его частей и назначения разработчика для написания
     * @param developer разработчик
     */
    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : projectElements){
            element.beWritten(developer);
        }
    }
}
