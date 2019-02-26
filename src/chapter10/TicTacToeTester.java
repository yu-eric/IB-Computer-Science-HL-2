package chapter10;

import javax.swing.*;

public class TicTacToeTester {

	public static void main(String[] args) {

		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.setTitle("Tic Tac Toe");
		ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TicTacToe.GameBoard gameboard = new TicTacToe.GameBoard();
		ticTacToe.add(gameboard);

		ticTacToe.pack();
		ticTacToe.setLocationRelativeTo(null);
		ticTacToe.setVisible(true);
	}
}
