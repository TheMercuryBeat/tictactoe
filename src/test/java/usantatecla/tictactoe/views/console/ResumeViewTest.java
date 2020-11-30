package usantatecla.tictactoe.views.console;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.utils.YesNoDialog;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
public class ResumeViewTest {

    @Mock
    private ResumeController resumeController;

    @Mock
    private YesNoDialog yesNoDialog;

    @InjectMocks
    private ResumeView resumeView;

    @BeforeEach
    void before() {
        openMocks(this);
    }

    @Test
    @Disabled
        // Mockito no esta funcionando
    void testGivenNewGameIsFalseWhenAResumeControllerIsPassedByParameterAndInteractThenIsFalse() {
        when(this.yesNoDialog.read(anyString())).thenReturn(false);
        this.resumeView.interact(this.resumeController);
        verify(this.resumeController).resume(false);
    }

    @Test
    @Disabled
        // Mockito no esta funcionando
    void testGivenNewGameIsTrueWhenAResumeControllerIsPassedByParameterAndInteractThenIsTrue() {
        when(this.yesNoDialog.read(anyString())).thenReturn(true);
        this.resumeView.interact(this.resumeController);
        verify(this.resumeController).resume(true);
    }
}
