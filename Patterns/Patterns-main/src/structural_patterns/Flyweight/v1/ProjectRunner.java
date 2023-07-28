package structural_patterns.Flyweight.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для тестирования, в котором созд. объект фабрики разработчиков
 * и получаемые от нее объекты сохраняются в лист разработчиков
 * По факту в фабрике будет создано всего 2 объекта
 */
public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developersList = new ArrayList<>();

        developersList.add(developerFactory.getDeveloper("java"));
        developersList.add(developerFactory.getDeveloper("java"));
        developersList.add(developerFactory.getDeveloper("java"));
        developersList.add(developerFactory.getDeveloper("java"));
        developersList.add(developerFactory.getDeveloper("java"));
        developersList.add(developerFactory.getDeveloper("java"));
        developersList.add(developerFactory.getDeveloper("java"));
        developersList.add(developerFactory.getDeveloper("java"));
        developersList.add(developerFactory.getDeveloper("c++"));
        developersList.add(developerFactory.getDeveloper("c++"));
        developersList.add(developerFactory.getDeveloper("c++"));

        for (Developer developer : developersList){
            developer.writeCode();
        }
        /*
          Размер листа с разработчиками = 11,
          хотя создано всего по одному экземляру классов разработчика (итого 2 объекта)
         */
        System.out.println("Размер листа: " + developersList.size());
    }
}
