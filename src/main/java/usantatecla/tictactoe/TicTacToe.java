package usantatecla.tictactoe;

import usantatecla.tictactoe.controllers.*;
import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.console.View;

public abstract class TicTacToe {

    private Game game;
    private StartController startController;
    private PlayController playController;
    private ResumeController resumeController;
    private View view;

    private Logic logic;
    private View newView;

    protected TicTacToe() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.playController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.view = this.createView(this.startController, this.playController, this.resumeController);
        this.logic = new Logic();
        this.newView = this.createView();
    }

    protected abstract View createView(StartController startController, PlayController playController, ResumeController resumeController2);

    protected abstract View createView();

    protected void play() {
        this.view.interact();
    }

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
