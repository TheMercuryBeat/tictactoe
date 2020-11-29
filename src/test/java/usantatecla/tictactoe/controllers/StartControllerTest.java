package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;

import static org.mockito.Mockito.verify;

public class StartControllerTest extends ControllerTest {

    @Override
    protected Controller createController() {
        return new StartController(new Game());
    }

    @Override
    protected void verifyVisitController() {
        verify(this.view).visit((StartController) this.controller);
    }


}
