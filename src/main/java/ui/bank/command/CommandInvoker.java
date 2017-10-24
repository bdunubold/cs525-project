package ui.bank.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker{
    private static List<Command> commandHistory = new ArrayList<>(21);
    private static int numberOfCommands = 20;
//    private Command currentCommand;

//    private CommandInvoker(){}

//    public void setCommand(Command command) {
//        currentCommand = command;
//    }

    private void addHistory(Command currentCommand) {
        if (currentCommand != null) {
            commandHistory.add(0, currentCommand);

            if (commandHistory.size() > numberOfCommands) {
                commandHistory.remove(commandHistory.size() - 1);
            }
        }
    }

    public void execute(Command currentCommand) {
        if (currentCommand != null) {
            currentCommand.execute();
            addHistory(currentCommand);

            currentCommand = null;
        }
    }

    public void undo() {
        if(commandHistory.size() > 0) {
            Command undoCommand = commandHistory.get(0);
            undoCommand.undo();

            commandHistory.remove(0);
        }
    }
}
