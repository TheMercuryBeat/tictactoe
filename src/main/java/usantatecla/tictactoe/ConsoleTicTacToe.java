package usantatecla.tictactoe;

import usantatecla.tictactoe.views.console.View;

class ConsoleTicTacToe extends TicTacToe {

	public static void main(String[] args) {
		new ConsoleTicTacToe().init();
	}

	@Override
	protected View createView() {
		return new View();
	}
}
