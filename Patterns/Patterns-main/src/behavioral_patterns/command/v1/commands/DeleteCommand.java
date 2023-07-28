package behavioral_patterns.command.v1.commands;

import behavioral_patterns.command.v1.base.DataBase;

/**
 * Класс выполнения команды delete()
 */
public class DeleteCommand implements Command{
    DataBase dataBase;

    public DeleteCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.delete();
    }
}
