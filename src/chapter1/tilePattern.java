package chapter1;

/**
 * A program that returns an array of 0, representing black tiles, and 1, representing white tiles, depending
 * on the number of rows and columns given.
 */
public class tilePattern {
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    private int row, col;

    public int[][] patternGenerator(int row, int col) {
        int counter = 0;
        int[][] board = new int[row][col];
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {

                if(j == 0 || j == row - 1) {
                    board[i][0] = 0;
                    board[i][row - 1] = 0;
                }

                if(i == 0 || i == col - 1) {
                    board[j][0] = 0;
                    board[j][col - 1] = 0;
                }

                else {
                    board[i][j] = 1;
                }
            }
        }

        if(row % 2  == 0) {
            counter = 1;
        }
        else if(row % 2 == 1) {
            counter = 0;
        }
        for(int i = 0; i < 2; i++) {
            if(col % 2 == 0) {
                board[(row - counter) / 2][(col / 2) - 1] = 0;
                board[(row - counter) / 2][(col / 2)] = 0;

                board[(row) / 2][(col / 2) - 1] = 0;
                board[(row) / 2][(col / 2)] = 0;
            }
            else {
                board[(row - counter) / 2][(col / 2) - 1] = 0;
                board[(row - counter) / 2][(col / 2)] = 0;
                board[(row - counter) / 2][(col / 2) + 1] = 0;

                board[(row) / 2][(col / 2) - 1] = 0;
                board[(row) / 2][(col / 2)] = 0;
                board[(row) / 2][(col / 2) + 1] = 0;
            }
        }
        return board;
    }


}
