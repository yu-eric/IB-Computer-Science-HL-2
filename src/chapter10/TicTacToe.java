package chapter10;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;

/**
 * This class creates a tic tac toe game that can be played by two people
 */
public class TicTacToe extends JFrame {

		private static final int EMPTY = 0,X_PIECE = 1,O_PIECE = 2;
		private int[][] gameGrid = new int[3][3];
		private boolean xTurn;
		private Random random;
		private boolean gameRunning;
		private int gameResult;

		/**
		 * Handles mouse input in the game
		 */
		private class GameListener implements MouseListener {

			public void mousePressed(MouseEvent e){

			}

			public void mouseClicked(MouseEvent e) {
				int xPos = e.getPoint().x;
				int yPos = e.getPoint().y;
				if(xPos > 50 && yPos > 50 && xPos < 50+50*3 && yPos < 50+50*3) {

					if(!gameRunning) {
						wipeGrid();
						gameRunning = true;
						repaint();
						return; }
					if(gameGrid[xPos/50-1][yPos/50-1] != EMPTY)
						return;

					if(xTurn) {
						gameGrid[xPos/50-1][yPos/50-1] = X_PIECE;
						xTurn = false;
					}
					else {
						gameGrid[xPos/50-1][yPos/50-1] = O_PIECE;
						xTurn = true;
					}
					gameResult = gameOver();
					if(gameResult != 0) {
						gameRunning = false;
					}
					repaint();
				}
			}
			public void mouseReleased(MouseEvent e){}
			public void mouseEntered(MouseEvent e){}
			public void mouseExited(MouseEvent e){}
		}

		/**
		 * Creates a new game board
		 */
		public TicTacToe() {
			setPreferredSize(new Dimension(256,256));
			setBackground(Color.WHITE);
			addMouseListener(new GameListener());
			random = new Random();
			wipeGrid();
			gameRunning = true;
		}

		/**
		 * Clears the game board of all pieces
		 */
		public void wipeGrid() {
			for(int y = 0; y < 3; y++)
				for(int x = 0; x < 3; x++)
					gameGrid[x][y] = EMPTY;
			if(random.nextInt(100) < 50)
				xTurn = true;
			else
				xTurn = false;
		}

		/**
		 * Checks to see if the game is over
		 *
		 * @return  0 if not over, 1 if X wins, 2 if O wins, 3 if a tie
		 */
		public int gameOver() {
			for (int x = 0; x < 3; x++) {
				if (gameGrid[x][0] == gameGrid[x][1] && gameGrid[x][1] == gameGrid[x][2])
					return gameGrid[x][0];
			}
			for (int y = 0; y < 3; y++) {
				if (gameGrid[0][y] == gameGrid[1][y] && gameGrid[1][y] == gameGrid[2][y])
					return gameGrid[0][y];
			}

			if (gameGrid[0][0] == gameGrid[1][1] && gameGrid[1][1] == gameGrid[2][2]) {
				return gameGrid[0][0];
			}
			if (gameGrid[2][0] == gameGrid[1][1] && gameGrid[0][2] == gameGrid[1][1]) {
				return gameGrid[2][0];
			}

			for (int y = 0; y < 3; y++) {
				for (int x = 0; x < 3; x++) {
					if (gameGrid[x][y] == 0) {
						return 0;
					}
				}
			}
			return 3;
		}

		/**
		 * Paints the game board
		 */
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.BLACK);
			for(int y = 1;y < 3;y++) {
				g.drawLine(50, y * 50 + 50, 50 + 50 * 3, y * 50 + 50);
			}
			for(int x = 1;x < 3;x++) {
				g.drawLine(x * 50 + 50, 50, x * 50 + 50, 50 + 50 * 3);
			}
			for(int y = 0;y < 3;y++)
			{
				for(int x = 0;x < 3;x++)
				{
					if(gameGrid[x][y] == X_PIECE) {
						g.setColor(Color.BLUE);
						g.drawLine(50 + x * 50,50 + y * 50,50 + x * 50 + 50,50 + y * 50 + 50);
						g.drawLine(50 + 50 + x * 50,50 + y * 50,50 + x * 50,50 + y * 50 + 50);
					}
					if(gameGrid[x][y] == O_PIECE) {
						g.setColor(Color.RED);
						g.drawOval(50 + x * 50,50 + y * 50,50,50);
					}
				}
			}
			g.setColor(Color.BLACK);

			if(gameRunning) {
				if(xTurn) {
					g.drawString("It is player X's turn.", 10, 20);
				}
				else {
					g.drawString("It is player O's turn.", 10, 20);
				}
			}
			else {
				if(gameResult == X_PIECE) {
					g.drawString("Player X won!", 10, 20);
				}
				if(gameResult == O_PIECE) {
					g.drawString("Player O won!", 10, 20);
				}
				if(gameResult == 3) {
					g.drawString("Tie game!", 10, 20);
					g.drawString("Click to start a new game.", 10, 40);
				}
			}
		}
	}