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

  public static void main(String[] args) {
    System.out.println(areSimilar(new int[]{2, 3, 1},
        new int[]{1, 3, 2}));
  }

}
