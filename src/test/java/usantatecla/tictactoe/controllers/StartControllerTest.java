package usantatecla.tictactoe.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.models.State;

import static org.mockito.Mockito.verify;

public class StartControllerTest extends ControllerTest {

    private StartController startController;

    @Spy
    private State state;

    @BeforeEach
    void beforeStartController() {
        this.startController = createController();
    }

    @Override
    protected StartController createController() {
        return new StartController(new Game(), this.state);
    }

    @Override
    protected void verifyVisitController() {
        verify(this.view).visit((StartController) this.controller);
    }

    @Test
    public void testShouldChangeNextState() {
        this.startController.start();
        verify(this.state).next();
    }


}
