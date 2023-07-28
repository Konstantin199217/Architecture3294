package behavioral_patterns.command.v1.commands;

import behavioral_patterns.command.v1.base.DataBase;

/**
 * Класс выполнения команды select
 */
public class SelectCommand implements Command{
    DataBase dataBase;

    public SelectCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.select();
    }
}
