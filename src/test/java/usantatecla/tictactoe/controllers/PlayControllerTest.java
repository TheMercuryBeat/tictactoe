package usantatecla.tictactoe.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.models.State;

import static org.mockito.Mockito.verify;

public class PlayControllerTest extends ControllerTest {

    private PlayController playController;

    @Spy
    private State state;

    @BeforeEach
    void beforePlayController() {
        this.playController = createController();
    }

    @Override
    protected PlayController createController() {
        return new PlayController(new Game(), this.state);
    }

    @Override
    protected void verifyVisitController() {
        verify(this.view).visit((PlayController) this.controller);
    }

    @Test
    public void testShouldChangeNextState() {
        this.playController.continueState();
        verify(this.state).next();
    }

}
