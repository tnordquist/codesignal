package dev.tnordquist;

import java.util.Arrays;

public class ArrayDifference {

  static int arrayMaximalAdjacentDifference(int[] inputArray) {
    int max = 0;

    for (int i = 0; i < inputArray.length-1; i++) {
      int diff = Math.abs(inputArray[i] - inputArray[i+1]);
      if(max < diff){
        max = diff;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(arrayMaximalAdjacentDifference(new int[]{10, 11, 13}));
  }


}
