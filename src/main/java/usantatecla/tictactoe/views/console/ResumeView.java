package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.views.Message;
import usantatecla.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(Message.RESUME.toString()));
	}

}
