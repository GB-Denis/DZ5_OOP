package ui;

import Presenter.Presenter;

public interface Viem {
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
}