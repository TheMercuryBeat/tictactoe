package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.models.State;

public class ResumeController extends Controller {

    public ResumeController(Game game) {
        super(game);
    }

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void resume() {
        this.game.reset();
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.game.reset();
            this.state.reset();
        } else {
            this.state.next();
        }
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
