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

        for (StateValue stateValue : StateValue.values()) {
            this.state.next();
            assertThat(this.state.getValueState(), is(equalTo(stateValue)));
        }

    }

}