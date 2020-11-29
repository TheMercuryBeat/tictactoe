package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;

import static org.mockito.Mockito.verify;

public class ResumeControllerTest extends ControllerTest {

    @Override
    protected Controller createController() {
        return new ResumeController(new Game());
    }

    @Override
    protected void verifyVisitController() {
        verify(this.view).visit((ResumeController) this.controller);
    }


}
