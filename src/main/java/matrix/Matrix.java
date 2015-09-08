package matrix;

public class Matrix {

    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix multiply(Matrix matrix) {
        int[][] newMatrix = new int[this.matrix.length][matrix.matrix.length];
        return new Matrix(newMatrix);
    }
}
