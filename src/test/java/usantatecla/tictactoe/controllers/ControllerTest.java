package usantatecla.tictactoe.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.views.console.View;

import static org.mockito.Mockito.spy;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
public abstract class ControllerTest {

    @Mock
    protected View view;

    protected Controller controller;

    @BeforeEach
    void before() {
        openMocks(this);
        this.controller = spy(createController());
    }

    protected abstract Controller createController();

    protected abstract void verifyVisitController();

    @Test
    void testAControllerWhenAcceptsAVisitorThenShouldVisitFromTheControllerHasBeenAccepted() {
        this.controller.accept(view);
        this.verifyVisitController();
    }

}
