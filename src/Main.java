import Model.Calculator;
import Presenter.Presenter;
import ui.Console;
import ui.Viem;


public class Main {
    public static void main(String[] args) {
        new Presenter(new Calculator(), (Viem) new Console()).start();
    }
}