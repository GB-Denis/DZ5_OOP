package Model;

import Presenter.Presenter;

public interface Model {
    void setPresenter(Presenter presenter);
    void inputExample(String example);
    String outputRes();
}