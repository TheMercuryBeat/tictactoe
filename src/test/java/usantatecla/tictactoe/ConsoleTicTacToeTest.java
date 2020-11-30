package usantatecla.tictactoe;

import org.mockito.InjectMocks;

class ConsoleTicTacToeTest extends TicTacToeTest {

    @InjectMocks
    private ConsoleTicTacToe consoleTicTacToe;

    @Override
    protected TicTacToe createTicTacToe() {
        return this.consoleTicTacToe;
    }

}
