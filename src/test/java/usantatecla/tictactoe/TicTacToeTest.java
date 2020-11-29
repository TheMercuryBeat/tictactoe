package usantatecla.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.views.View;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
abstract class TicTacToeTest {

    @Mock
    private Logic logic;

    @Mock
    private View view;

    @Mock
    protected StartController startController;

    @Mock
    protected PlayController playController;

    @Mock
    protected ResumeController resumeController;

    private TicTacToe ticTacToe;

    @BeforeEach
    void before() {
        openMocks(this);
        this.ticTacToe = createTicTacToe();
    }

    protected abstract TicTacToe createTicTacToe();

    @Test
    void test() {

        when(this.logic.getController()).thenReturn(this.startController);
        ticTacToe.init();
        verify(view).interact(eq(this.startController));

    }

}
