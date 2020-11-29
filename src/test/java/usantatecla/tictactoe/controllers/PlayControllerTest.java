package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;

import static org.mockito.Mockito.verify;

public class PlayControllerTest extends ControllerTest {

    @Override
    protected Controller createController() {
        return new PlayController(new Game());
    }

    @Override
    protected void verifyVisitController() {
        verify(this.view).visit((PlayController) this.controller);
    }


}
