package structural_patterns.Flyweight.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс - приспособленец
 * Фабрика разработчиков, которая хранит Мапу разработчиков по ключу "специальность",
 * если разработчика с необходимой специальностью нет, то создается новый объек, иначе
 * возвращается ранее созданный разработчик
 */
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloper(String speciality){
        Developer developer = developers.get(speciality);
        if(developer == null){
            switch (speciality) {
                case "java" -> {
                    System.out.println("Создается Java разработчик");
                    developer = new JavaDeveloper();
                }
                case "c++" -> {
                    System.out.println("Создается C++ разработчик");
                    developer = new CppDeveloper();
                }
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
