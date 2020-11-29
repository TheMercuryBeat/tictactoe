package usantatecla.tictactoe.views.console;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
public class ViewTest {

    @Mock
    private StartController startController;

    @Mock
    private PlayController playController;

    @Mock
    private ResumeController resumeController;

    @Mock
    private StartView startView;

    @Mock
    private PlayView playView;

    @Mock
    private ResumeView resumeView;

    @InjectMocks
    private View view;

    @BeforeEach
    void before() {
        openMocks(this);
    }

    @Test
    void testGivenViewWhenStartViewIsVisitedThenShouldInteractWithStartController() {
        view.visit(startController);
        verify(startView).interact(eq(startController));
    }

    @Test
    void testGivenViewWhenPlayViewIsVisitedThenShouldInteractWithPlayController() {
        view.visit(playController);
        verify(playView).interact(eq(playController));
    }

    @Test
    void testGivenViewWhenResumeViewIsVisitedThenShouldInteractWithResumeController() {
        view.visit(resumeController);
        verify(resumeView).interact(eq(resumeController));
    }

}
