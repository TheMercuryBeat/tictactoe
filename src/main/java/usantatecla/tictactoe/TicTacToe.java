package usantatecla.tictactoe;

import usantatecla.tictactoe.controllers.Controller;
import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.views.console.View;

public abstract class TicTacToe {

    private Logic logic;
    private View newView;

    protected TicTacToe() {
        this.logic = new Logic();
        this.newView = this.createView();
    }

    protected abstract View createView();

    protected void init() {
        Controller controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.newView.interact(controller);
            }
        } while (controller != null);
    }
}
