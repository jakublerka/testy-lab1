import org.example.Main;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class mainTest {

    //wieza, JUnit 5, Hamcrest

    int inputTable[][] = new int[8][8];
    int output[][] = new int[8][8];
    int inputIntX, inputIntY;

    //Printuje input i wynik każdego testu na konsolę
    @AfterEach
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
    public void testTopLeftCorner() {
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

        output = Main.markPossibleMoves(inputTable, 0,0);
        assertThat(output, equalTo(outputTable));
    }

    @Test
    public void testBottomLeftCorner() {
        inputTable  = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] outputTable = new int[][]{
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };

        output = Main.markPossibleMoves(inputTable, 7,0);
        assertThat(output, equalTo(outputTable));
    }


    @Test
    public void testTopRightCorner() {
        inputTable  = new int[][]{
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

        output = Main.markPossibleMoves(inputTable, 0,7);
        assertThat(output, equalTo(outputTable));
    }

    @Test
    public void testBottomRightCorner() {
        inputTable  = new int[][]{
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
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };

        output = Main.markPossibleMoves(inputTable, 7,7);
        assertThat(output, equalTo(outputTable));
    }

    @Test
    public void testMiddle() {
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
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0}
        };
        output = Main.markPossibleMoves(inputTable, 3,3);
        assertThat(output, equalTo(outputTable));
    }


    @Test
    public void checkPlayerInputXEqualAboveZero() {
        inputIntX = 0;
        assertThat(inputIntX, is(greaterThanOrEqualTo(0)));
        System.out.println("Wartość X: "+inputIntX+" jest równa bądź większa od 0");

    }

    @Test
    public void checkPlayerInputXEqualBelowSever() {
        inputIntX = 0;
        assertThat(inputIntX, is(lessThanOrEqualTo(7)));
        System.out.println("Wartość X: "+inputIntX+" jest równa bądź mniejsza od 7");
    }

    @Test
    public void checkPlayerInputYEqualAboveZero() {
        inputIntY = 5;
        assertThat(inputIntY, is(greaterThanOrEqualTo(0)));
        System.out.println("Wartość Y: "+inputIntY+" jest równa bądź większa od 0");

    }

    @Test
    public void checkPlayerInputYEqualBelowSeven() {
        inputIntY = 7;
        assertThat(inputIntY, is(lessThanOrEqualTo(7)));
        System.out.println("Wartość Y: "+inputIntY+" jest równa bądź mniejsza od 7");

    }

}