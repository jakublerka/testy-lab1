import org.example.Main;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class mainTest {

    //wieza, JUnit 5, Hamcrest

    int inputTable[][] = new int[8][8];
    int output[][] = new int[8][8];
    int inputIntX, inputIntY, pionek;

    @After
    public void print(){
        System.out.println("Input:                         Output:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(inputTable[i][j] + "  ");
            }
            System.out.print("      ");
            for (int j = 0; j < 8; j++) {
                System.out.print(output[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        inputIntX = 0;
        inputIntY = 0;
    }


    @Test
    public void testLeftCorner() {
        inputTable = new int[][]{
                {1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] outputTable = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0}
        };

        output = Main.calculatePossibleMoves(inputTable);
        assertThat(Main.calculatePossibleMoves(inputTable), equalTo(output));

    }

    @Test
    public void testRightCorner() {
        inputTable = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] outputTable = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1}
        };

        output = Main.calculatePossibleMoves(inputTable);
        assertThat(Main.calculatePossibleMoves(inputTable), equalTo(output));
    }

    @Test
    public void testZero() {
        inputTable = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] outputTable = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        output = Main.calculatePossibleMoves(inputTable);
        assertThat(Main.calculatePossibleMoves(inputTable), equalTo(output));
    }


    @Test
    public void checkPlayerInputX() {
        Random random = new Random();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc X pionka");
        inputIntX = random.nextInt(-10,10);

        assertThat(inputIntX, is(lessThan(8)));
        assertThat(inputIntX, is(greaterThan(0)));
    }

    @Test
    public void checkPlayerInputY() {
        Random random = new Random();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc Y pionka");
        inputIntY = random.nextInt(-10,10);

        assertThat(inputIntY, is(lessThan(8)));
        assertThat(inputIntY, is(greaterThan(0)));
    }

}