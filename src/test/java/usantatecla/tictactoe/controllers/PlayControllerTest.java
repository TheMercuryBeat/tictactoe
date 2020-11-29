package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.models.State;

import static org.mockito.Mockito.verify;

public class PlayControllerTest extends ControllerTest {

    @Override
    protected Controller createController() {
        return new PlayController(new Game(), new State());
    }

    @Override
    protected void verifyVisitController() {
        verify(this.view).visit((PlayController) this.controller);
    }


}
