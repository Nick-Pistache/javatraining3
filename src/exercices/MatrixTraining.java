import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Arrays;
import java.util.stream.Stream; 
import java.io.*;


public class MatrixTraining {

    /**
     * @param lines   height of the matrix, ie: 3
     * @param columns width of the matrix, ie: 2
     * @return an empty int matrix of lines and columns size,
     * ie: {{0, 0}, {0, 0}, {0, 0}}
     */
    public int[][] emptyIntMatrix(int lines, int columns) {
        return new int[lines][columns];
    }

    /**
     * @param lines   height of the matrix, ie: 2
     * @param columns width of the matrix, ie: 3
     * @return an empty string matrix of lines and columns size,
     * ie: {{null, null, null}, {null, null, null}}
     */
    public String[][] emptyStringMatrix(int lines, int columns) {
        return new String[lines][columns];
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return an int matrix with a, b and c arrays
     */
    public int[][] intMatrix(int[] a, int[] b, int[] c) {
        return new int[][] {a,b,c};
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return an int matrix with a, b and c arrays
     */
    public String[][] stringMatrix(String[] a, String[] b, String[] c) {
        return new String[][] {a,b,c};
    }

    /**
     * @param matrix, ie: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix lines, ie: 3
     */
    public int height(int[][] matrix) {
        return matrix.length;
    }

    /**
     * @param matrix, ie: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix columns, ie: 2
     */
    public int width(int[][] matrix) {
        return matrix[0].length;
    }

    /**
     * @param matrix, ie: {{3, 4, 5}, {6, 7, 8}}
     * @param line,   ie: 1
     * @param column, ie: 0
     * @return value in matrix at line and column, ie: 6
     */
    public int valueAtPosition(int[][] matrix, int line, int column) {
        return matrix[line][column];
    }

    /**
     * @param matrix, ie: {{1, 2, 3}, {8, 5, 6}}
     * @param value,  ie: 4
     * @param line,   ie: 1
     * @param column, ie: 0
     * @return the matrix with the value replaced at line and column,
     * ie: {{1, 2, 3}, {4, 5, 6}}
     */
    public int[][] replace(int[][] matrix, int value, int line, int column) {        
        matrix[line][column] = value;
        return matrix;
    }

    /**
     * @param matrix, ie: {{1, 2, 3}, {4, 5, 6}}
     * @return sum of matrix values, ie: 21
     */
    public int sum(int[][] matrix) {
        return IntStream.of(matrix[0]).sum() + IntStream.of(matrix[1]).sum();
    }

    /**
     * @param matrix, ie: {{1, 2, 3}, {4, 5, 6}}
     * @param search, ie: 5
     * @return if matrix contains searched value, ie: true
     */
    public boolean contains(int[][] matrix, int search) {
        boolean found = false;
        for (int i = 0 ; i < matrix.length ; i++) {
            found = Arrays.asList(matrix[i]).contains(search) ? false : true;
        }
        return found;
    }

    /**
     * @param matrix, ie: {{1, 2, 3}, {4, 5, 6}}
     * @return how many even numbers are in matrix, ie: 3
     */
    public int countEvens(int[][] matrix) {
        int count = 0;
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length ; j++) {
                if(matrix[i][j] % 2 == 0) {count++;}
            }
        }
        return count;
    }

    /**
     * @param matrix, ie: {{'d', 'b', 'a'}, {'a', 'd', 'a'}}
     * @param search, ie: 'a'
     * @return the number of character occurrences in matrix, ie: 3
     */
    public int occurrences(char[][] matrix, char search) {
        int count = 0;
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length ; j++) {
                if(matrix[i][j]== search) {count++;}
            }
        }
        return count;
    }
    
}
