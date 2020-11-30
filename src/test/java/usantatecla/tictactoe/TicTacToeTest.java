package usantatecla.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.controllers.*;
import usantatecla.tictactoe.models.StateValue;
import usantatecla.tictactoe.views.View;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
abstract class TicTacToeTest {

    @Mock
    protected Logic logic;

    @Mock
    protected View newView;

    @Mock
    protected View view;

    @Mock
    protected Map<StateValue, Controller> controllers;

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

        verify(this.newView, times(1)).interact(eq(this.startController));
        verify(this.newView, times(1)).interact(eq(this.playController));
        verify(this.newView, times(1)).interact(eq(this.resumeController));

    }

    @Test
    void testShouldReturnAViewWhenTheControllersArePassedByConstructor() {
        assertNotNull(this.ticTacToe.createView(startController, playController, resumeController));
    }

    @Test
    void testShouldReturnAViewWhenNothingIsPassedByConstructor() {
        assertNotNull(this.ticTacToe.createView());
    }

}
