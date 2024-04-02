package org.example;
import java.util.Scanner;


//wieza, JUnit 5, Hamcrest

public class Main {
    /*
    public static void main(String[] args) {
        int m, n;
        int szachownica[][] = new int[8][8];

        for (m = 0; m < 8; m++) {
            for (n = 0; n < 8; n++) {
                szachownica[m][n] = 0;
            }
        }

        wprowadzPozycjePionka(szachownica, 1);

        //wprowadzPozycjePionka(szachownica, 2);


        System.out.println("Tablica z wprowadzonymi pionkami:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(szachownica[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void wprowadzPozycjePionka(int[][] szachownica, int pionek) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wspolrzedna X pionka " + pionek + ": ");
        int pozycjaX = scanner.nextInt();

        System.out.println("Wprowadz wspolrzedna Y pionka: ");
        int pozycjaY = scanner.nextInt();
        int row = pozycjaX;
        int col = pozycjaY;

        szachownica[row][col] = pionek;

    }

    public static int[][] calculatePossibleMoves(int[][] input) {
        int[][] output = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (input[i][j] == 1) {
                    int[] x = {-2, -2, -1, -1, 1, 1, 2, 2};
                    int[] y = {-1, 1, -2, 2, -2, 2, -1, 1};

                    for (int k = 0; k < 8; k++) {
                        int newX = i + x[k];
                        int newY = j + y[k];

                        if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                            output[newX][newY]++;
                        }
                    }
                }
            }
        }
        return output;
    }
    */

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

    /*
    public static int[][] calculatePossibleMoves(int[][] input) {
        int[][] output = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (input[i][j] == 1)
                {
                    int[] x = {-2, -2, -1, -1, 1, 1, 2, 2};
                    int[] y = {-1, 1, -2, 2, -2, 2, -1, 1};

                    for (int k = 0; k < 8; k++) {
                        int newX = i + x[k];
                        int newY = j + y[k];

                        if(newX >= 0 && newX < 8 && newY >= 0 && newY < 8){
                            output[newX][newY]++;
                        }
                    }
                }
            }
        }
        return output;
    }
     */

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