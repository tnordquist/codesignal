package dev.tnordquist;

import java.util.Arrays;

public class TwoDArray {

  static int[][] boxBlur(int[][] image) {

    int[][] blurred = new int[image.length - 2][image[0].length - 2];

    for (int rowSeed = 0; rowSeed < image.length - 2; rowSeed++) {
      for (int colSeed = 0; colSeed < image[0].length - 2; colSeed++) {
        int blurrSum = 0;
        for (int row = rowSeed; row < rowSeed+3; ++row) {
          for (int col = colSeed; col < colSeed+3; ++col) {
            blurrSum += image[row][col];

          }
        }
      blurred[rowSeed][colSeed] += Math.floorDiv(blurrSum,9);
      }
    }
    return blurred;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(boxBlur(new int[][]{{0,18,9}, {27,9,0}, {81,63,45}})));
  }
}