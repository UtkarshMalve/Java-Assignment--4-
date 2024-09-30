package ASSIGNMENT4;

class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid indices: " + i + ", " + j);
        }
    }

    public Matrix add(Matrix other) {
        if (rows != other.rows || columns != other.columns) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.elements[i][j] = elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

    public Matrix subtract(Matrix other) {
        if (rows != other.rows || columns != other.columns) {
            System.out.println("Matrices cannot be subtracted");
            return null;
        }

        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.elements[i][j] = elements[i][j] - other.elements[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (columns != other.rows) {
            System.out.println("Matrix multiplication not possible");
            return null;
        }

        Matrix result = new Matrix(rows, other.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                result.elements[i][j] = 0;
                for (int k = 0; k < columns; k++) {
                    result.elements[i][j] += elements[i][k] * other.elements[k][j];
                }
            }
        }
        return result;
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        Matrix matrix2 = new Matrix(2, 3);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(0, 2, 9);
        matrix2.setElement(1, 0, 10);
        matrix2.setElement(1, 1, 11);
        matrix2.setElement(1, 2, 12);

        Matrix sum = matrix1.add(matrix2);
        Matrix difference = matrix1.subtract(matrix2);
        Matrix product = matrix1.multiply(matrix2);

        if (sum != null) {
            System.out.println("Sum:");
            sum.display();
        }

        if (difference != null) {
            System.out.println("Difference:");
            difference.display();
        }

        if (product != null) {
            System.out.println("Product:");
            product.display();
        }
    }
}