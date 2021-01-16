package dev.tnordquist;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayDifference {

  static int arrayMaximalAdjacentDifference(int[] inputArray) {
    int max = 0;

    for (int i = 0; i < inputArray.length - 1; i++) {
      int diff = Math.abs(inputArray[i] - inputArray[i + 1]);
      if (max < diff) {
        max = diff;
      }
    }
    return max;
  }

  /**
   * problem 22
   *
   * @param arr is a primitive integer array
   * @return int min value that "avoids landing" on values in the array
   */
  static int avoidObstacles(int[] arr) {
    int avoid = 2;
    int count = 0;
    Arrays.sort(arr);
    while (avoid < arr[arr.length - 1] + 2) {
      for (int j : arr) {
        if (j % avoid != 0) {
          count++;
        }
      }
      if (count == arr.length) {
        break;
      } else {
        count = 0;
        avoid++;
      }
    }
    return avoid;
  }

  /**
   * problem 32
   * @param a
   * @return
   */
  static int absoluteValuesSumMinimization(int[] a) {
    int lowestFormVal = Integer.MAX_VALUE;
    int currentFormVal = 0;
    int closest = a[0];
    int currentX;

    for (int j : a) {
      currentX = j;
      for (int k : a) {
        currentFormVal += Math.abs(k - currentX);
      }
      if (lowestFormVal == currentFormVal) {
        if (closest > currentX) {
          closest = currentX;
        }
      } else if (currentFormVal < lowestFormVal) {
        lowestFormVal = currentFormVal;
        closest = currentX;
      }
      currentFormVal = 0;
    }
    return closest;
  }

  static int absoluteValuesSumMinimization2(int[] A) {
    return A[(A.length-1)/2];

  }

  public static void main(String[] args) {
    System.out.println(absoluteValuesSumMinimization2(new int[]{1, 1, 3, 4}));
  }


}
