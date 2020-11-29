package usantatecla.tictactoe.models;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StateTest {

    private State state;

    public StateTest() {
        this.state = new State();
    }

    @Test
    public void testAnyStateWhenGetStateValueResetShouldReturnTheStateValue() {
        assertThat(this.state.getValueState(), is(equalTo(StateValue.INITIAL)));
    }

    @Test
    public void testGivenStateWhenDoNextShouldReturnTheStateValue() {

        for (int i = 1; i < StateValue.values().length; i++) {
            this.state.next();
            assertThat(this.state.getValueState(), is(equalTo(StateValue.values()[i])));
        }

    }

    @Test
    public void testAnyStateWhenDoResetShouldReturnTheInitialStateValue() {

        this.state.next();
        this.state.reset();

        assertThat(this.state.getValueState(), is(equalTo(StateValue.INITIAL)));
    }

}