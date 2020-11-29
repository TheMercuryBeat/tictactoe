package usantatecla.tictactoe.views;

import usantatecla.tictactoe.controllers.Controller;
import usantatecla.tictactoe.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {

    public void interact() {
        do {
            this.start();
            this.play();
        } while (this.isResumed());
    }

    protected abstract void start();

    protected abstract void play();

    protected abstract boolean isResumed();

    public void interact(Controller controller) {
    }

}
