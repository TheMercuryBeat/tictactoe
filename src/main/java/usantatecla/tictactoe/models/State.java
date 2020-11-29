package usantatecla.tictactoe.models;


public class State {

    private StateValue stateValue;

    public State() {
        this.stateValue = StateValue.INITIAL;
    }

    public void reset() {
    }

    public void next() {
    }

    public StateValue getValueState() {
        return stateValue;
    }

}
