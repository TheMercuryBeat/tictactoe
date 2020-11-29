package usantatecla.tictactoe.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;

public class LogicTest {

    private Logic logic;

    @BeforeEach
    void before() {
        this.logic = new Logic();
    }

    @Test
    void testGivenNewGameWhenGetsStateValueThenShouldReturnTheControllerForThatState() {
        assertThat(logic.getController(), isA(StartController.class));
    }

}
