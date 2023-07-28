package behavioral_patterns.command.v1.commands;

import behavioral_patterns.command.v1.base.DataBase;

/**
 * Класс выполнения команды update
 */
public class UpdateCommand implements Command{
    DataBase dataBase;

    public UpdateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
