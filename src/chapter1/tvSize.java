package chapter1;

public class tvSize {

    double length, height;
    int diagonalLength;

    public tvSize() {
       this.diagonalLength = diagonalLength;

    }
    public void aspectRatioToSize(int diagonalLength) {
        length = Math.sqrt((256 * Math.pow(diagonalLength, 2)) / 337);
        height = (9 * length) / 16;
    }

}
