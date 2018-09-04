package chapter1;

public class tvSize {

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    double length, height;
    double diagonalLength;

    public void aspectRatioToSize(double diagonalLength) {
        length = Math.sqrt((256 * Math.pow(diagonalLength, 2)) / 337);
        height = (9 * length) / 16;
    }


}
