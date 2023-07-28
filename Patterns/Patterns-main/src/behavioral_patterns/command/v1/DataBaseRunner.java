package behavioral_patterns.command.v1;

import behavioral_patterns.command.v1.base.DataBase;
import behavioral_patterns.command.v1.base.Developer;
import behavioral_patterns.command.v1.commands.DeleteCommand;
import behavioral_patterns.command.v1.commands.InsertCommand;
import behavioral_patterns.command.v1.commands.SelectCommand;
import behavioral_patterns.command.v1.commands.UpdateCommand;

/**
 * Клиентский класс. Создаем объект БД,
 * создаем объект Developer для вызова методов используя паттерн Command
 */
public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Developer developer = new Developer(
                new InsertCommand(dataBase),
                new UpdateCommand(dataBase),
                new DeleteCommand(dataBase),
                new SelectCommand(dataBase));

        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }




}
