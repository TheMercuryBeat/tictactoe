package usantatecla.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.views.console.View;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
class ConsoleTicTacToeTest {

    @Mock
    private StartController startController;

    @Mock
    private PlayController playController;

    @Mock
    private ResumeController resumeController;

    @InjectMocks
    private ConsoleTicTacToe consoleTicTacToe;

    @BeforeEach
    void before() {
        openMocks(this);
    }

    @Test
    void testShouldReturnAViewWhenTheControllersArePassedByConstructor() {
        assertNotNull(consoleTicTacToe.createView(startController, playController, resumeController));
    }

    @Test
    void testShouldReturnAViewWhenNothingIsPassedByConstructor() {
        assertNotNull(consoleTicTacToe.createView());
    }
}
