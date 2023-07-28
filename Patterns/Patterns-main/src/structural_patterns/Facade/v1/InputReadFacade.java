package structural_patterns.Facade.v1;

import java.util.Scanner;

/**
 * Класс фасада который скрывает реалицию программного кода
 */
public class InputReadFacade {
    public String read(){
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        System.out.print("Введите текст: ");
        builder.append(sc.nextLine());
        builder.append("\n");
        builder.append("Эта строка добавлена в фасаде");
        return builder.toString();
    }
}
