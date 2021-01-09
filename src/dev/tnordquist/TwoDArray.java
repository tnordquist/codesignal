package dev.tnordquist;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoDArray {

  /**
   * problem 23
   */
  static int[][] boxBlur(int[][] image) {

    int[][] blurred = new int[image.length - 2][image[0].length - 2];

    for (int rowSeed = 0; rowSeed < image.length - 2; rowSeed++) {
      for (int colSeed = 0; colSeed < image[0].length - 2; colSeed++) {
        int blurrSum = 0;
        for (int row = rowSeed; row < rowSeed + 3; ++row) {
          for (int col = colSeed; col < colSeed + 3; ++col) {
            blurrSum += image[row][col];

          }
        }
        blurred[rowSeed][colSeed] += Math.floorDiv(blurrSum, 9);
      }
    }
    return blurred;
  }

  /**
   * problem 24
   *
   * @param matrix
   * @return
   */
  static int[][] minesweeper(boolean[][] matrix) {

    int x = 0;
    int y = 0;
    int[][] mines = new int[matrix.length][matrix[0].length];

    int[][] dir = new int[][]{
        {1, -1}, {1, 0}, {1, 1},
        {0, -1}, {0, 1},
        {-1, -1}, {-1, 0}, {-1, 1}};

    for (x = 0; x < matrix.length; x++) {
      for (y = 0; y < matrix[0].length; y++) {
        for (int[] ints : dir) {
          if (!(x + ints[0] < 0) && !(x + ints[0] > matrix.length - 1) && !(y + ints[1] < 0)
              && !(y + ints[1]
              > matrix[0].length - 1)) {
            if (matrix[x + ints[0]][y + ints[1]]) {
              mines[x][y]++;
            }
          }
        }
      }
    }
    return mines;
  }

  public static void main(String[] args) {
//    System.out
//        .println(Arrays.deepToString(boxBlur(new int[][]{{0, 18, 9}, {27, 9, 0}, {81, 63, 45}})));
    System.out.println(Arrays.deepToString(minesweeper(
        new boolean[][]{{true, false, false, true}, {false, false, true, false},
            {true, true, false, true}})));
  }
}
//    IntStream stream = Arrays.stream(directions).flatMapToInt(x -> Arrays.stream(x));
