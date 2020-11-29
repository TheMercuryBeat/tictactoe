package usantatecla.tictactoe.views.console;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.controllers.StartController;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
public class ViewTest {

    @Mock
    private StartController startController;

    @Mock
    private StartView startView;

    @InjectMocks
    private View view;

    @BeforeEach
    void before() {
        openMocks(this);
    }

    @Test
    void testGivenNewStartViewWhenReadNumberOfUsersThenGameSetNumberOfUsers() {
        view.visit(startController);
        verify(startView).interact(eq(startController));
    }

}
