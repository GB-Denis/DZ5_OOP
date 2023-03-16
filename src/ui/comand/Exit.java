package ui.comand;

import ui.Console;

public class Exit extends Comand{
    public Exit(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Выход.";
    }

    @Override
    public void execute() {
        getConsole().end();
    }
}