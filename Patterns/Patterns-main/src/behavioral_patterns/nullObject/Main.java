package behavioral_patterns.nullObject;

import java.io.File;

/**
 * Клиентский класс для проверки кода.
 * В методу getAnimal искусственно возвращается null,
 * после применения паттерна NullObject вместо null возвращается
 * класс, который ни чего не делает, тем самым позволяя избежать NullPointerException
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = getAnimal();
        animal.say();
    }
    static Animal getAnimal(){
        try {
            if (new File("noSuchFile.txt").exists()){
                return new Tiger();
            }
        }finally {
            // return null;
            return new NoAnimal();
        }
    }
}
