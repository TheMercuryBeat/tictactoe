package usantatecla.tictactoe.views;

import usantatecla.tictactoe.controllers.Controller;
import usantatecla.tictactoe.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {

    public void interact(Controller controller) {
        controller.accept(this);
    }

}
