package usantatecla.tictactoe;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConsoleTicTacToeTest extends TicTacToeTest {

    @InjectMocks
    private ConsoleTicTacToe consoleTicTacToe;

    @Override
    protected TicTacToe createTicTacToe() {
        return this.consoleTicTacToe;
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
