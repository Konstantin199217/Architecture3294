package behavioral_patterns.command.v1.commands;

import behavioral_patterns.command.v1.base.DataBase;

/**
 * Класс выполнения команды insert
 */
public class InsertCommand implements Command{
    DataBase dataBase;

    public InsertCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
