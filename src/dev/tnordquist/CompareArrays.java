package dev.tnordquist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompareArrays {

  private static boolean areSimilar(int[] a, int[] b) {

    int mark = -1;
    int grace = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i] && mark > -1) {
        if (a[i] != b[mark] || b[i] != a[mark]) {
          return false;
        } else if (a[i] == b[mark] && b[i] == a[mark] && ++grace > 1) {
          return false;
        }
      } else if (a[i] != b[i]) {
        mark = i;
      }
    }
    return true;
  }


  static boolean chessBoardCellColor(String cell1, String cell2) {

    char[] char1 = cell1.toCharArray();
    char[] char2 = cell2.toCharArray();
    boolean oneDark = false;
    boolean twoDark = false;

    if((char1[0] % 2 != 0 && char1[1] % 2 != 0)
        ||(char1[0] % 2 == 0 && char1[1] % 2 == 0) ) {
      oneDark = true;
    }

    if((char2[0] % 2 != 0 && char2[1] % 2 != 0)
        ||(char2[0] % 2 == 0 && char2[1] % 2 == 0) ) {
      twoDark = true;
    }
    return oneDark == twoDark;
  }

  static boolean chessBoardCellColor2(String cell1, String cell2) {

    char[] char1 = cell1.toCharArray();
    char[] char2 = cell2.toCharArray();
    return Math.abs(char1[0] - char2[0]) % 2 == Math.abs(char1[1]-char2[1]) % 2;

  }

  public static void main(String[] args) {
//    System.out.println(areSimilar(new int[]{2, 3, 1},
//        new int[]{1, 3, 2}));

    long startTime = System.nanoTime();
    System.out.println(chessBoardCellColor ("A1", "B2"));
    long endTime = System.nanoTime();
    System.out.println((endTime - startTime));  //divide by 1000000 to get milliseconds.

    long startTime2 = System.nanoTime();
    System.out.println(chessBoardCellColor2 ("A1", "B2"));
    long endTime2 = System.nanoTime();
    System.out.println((endTime2 - startTime2));  //divide by 1000000 to get milliseconds.
  }

}
