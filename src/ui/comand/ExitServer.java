package ui.comand;

import ui.Console;

public class ExitServer extends Comand{
    public ExitServer(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Выключить сервер.";
    }

    @Override
    public void execute() {
        getConsole().endServer();
    }
}