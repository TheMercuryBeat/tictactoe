package usantatecla.tictactoe.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LogicTest {

    private Logic logic;

    @BeforeEach
    void before() {
        this.logic = new Logic();
    }

    @Test
    void testGivenNewGameWhenGetsStateValueThenShouldReturnTheControllerForThatState() {
        assertThat(logic.getController(), is(equalTo(StartController.class)));
    }

}
