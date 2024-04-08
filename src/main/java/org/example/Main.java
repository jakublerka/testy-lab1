package org.example;
import java.util.Scanner;


//wieza, JUnit 5, Hamcrest

public class Main {

    public int row, column;
    public static void main(String[] args) {

        int[][] inputTable = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        //int[][] outputTable = calculatePossibleMoves(inputTable);
        int[][] outputTable = markPossibleMoves(inputTable, 3,4);

        // --- Wyświetlenie wyniku ---
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(outputTable[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] markPossibleMoves(int[][] input, int row, int col) {
        input[row][col]=1;
        int[][] output = new int[8][8];
        output[row][col]=1;

        // Mark horizontal moves
        for (int i = 0; i < 8; i++) {
            if (i != col) {
                output[row][i] = 1;
            }
        }

        // Mark vertical moves
        for (int i = 0; i < 8; i++) {
            if (i != row) {
                output[i][col] = 1;
            }
        }
        return output;
    }

}