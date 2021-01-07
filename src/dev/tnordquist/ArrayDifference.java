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

  /** problem 22
   *
   * @param arr is a primitive integer array
   * @return int min value that "avoids landing" on values in the array
   */
  static int avoidObstacles(int[] arr) {
    int avoid = 2;
    int count = 0;
    Arrays.sort(arr);
    while (avoid < arr[arr.length-1]+2){
      for (int j : arr) {
        if (j % avoid != 0) {
          count++;
        }
      }
      if(count == arr.length) {
        break;
      } else {
        count = 0;
        avoid++;
      }
    }
    return avoid;
  }

  public static void main(String[] args) {
    System.out.println(avoidObstacles(new int[]{5, 8, 9, 13, 14}));
  }


}
