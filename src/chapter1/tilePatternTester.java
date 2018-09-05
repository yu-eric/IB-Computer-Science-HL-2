package chapter1;

import java.util.Scanner;

public class tilePatternTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        tilePattern tiles = new tilePattern();
        System.out.println("Please enter the number of rows: ");
        int rows = in.nextInt();
        tiles.setRow(rows);
        System.out.println("Please enter the number of columns: ");
        int col = in.nextInt();
        tiles.setCol(col);

        int[][] tilesPattern = tiles.patternGenerator(rows, col);
        for(int i = 0; i < tiles.getCol(); i++) {
            for(int j = 0; j < tiles.getRow(); j++) {
                System.out.print(tilesPattern[i][j] + "   ");
            }
            System.out.println("\n");
        }
    }
}
