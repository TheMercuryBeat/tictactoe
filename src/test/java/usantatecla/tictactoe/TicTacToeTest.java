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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
abstract class TicTacToeTest {

    @Mock
    protected Logic logic;

    @Mock
    protected View view;

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
    void testShouldInteractWithEachController() {

        when(this.logic.getController())
                .thenReturn(this.startController)
                .thenReturn(this.playController)
                .thenReturn(this.resumeController)
                .thenReturn(null);

        this.ticTacToe.init();

        verify(this.view, times(1)).interact(eq(this.startController));
        verify(this.view, times(1)).interact(eq(this.playController));
        verify(this.view, times(1)).interact(eq(this.resumeController));

    }

    @Test
    void testShouldReturnAViewWhenNothingIsPassedByConstructor() {
        assertNotNull(this.ticTacToe.createView());
    }

}
