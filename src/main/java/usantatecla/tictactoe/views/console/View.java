package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.ControllerVisitor;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;

public class View extends usantatecla.tictactoe.views.View implements ControllerVisitor {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

	public View(StartController startController, PlayController playController, ResumeController resumeController) {
		this.startView = new StartView(startController);
		this.playView = new PlayView(playController);
		this.resumeView = new ResumeView(resumeController);
	}

	@Override
	protected void start(){
		this.startView.interact();
	}

	@Override
	protected void play() {
		this.playView.interact();
	}

	@Override
	protected boolean isResumed() {
		return this.resumeView.interact();
	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	@Override
	public void visit(PlayController playController) {
		this.playView.interact(playController);
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}
}
