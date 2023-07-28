package behavioral_patterns.itertaor;

/**
 * Класс клиент, проверяем работу итератора создав объект итератора
 * и обходя поле объекта Developer
 */
public class RunDeveloper {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven", "Python", "MySQL"};
        Developer developer = new Developer("Evgen", skills);
        Iterator iterator = developer.getIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
